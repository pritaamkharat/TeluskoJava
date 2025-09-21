package telusko0920;

import java.util.Scanner;

class Telusko3 implements Runnable{

    public void banking(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Account Number");
        int acc = scan.nextInt();
        System.out.println("Enter password");
        int pw = scan.nextInt();
        System.out.println("Collect your cash");
    }
    public void importantMessage(){
        for (int i=0;i<4;i++){
            System.out.println("Focus is a key to master any skill");
            try{
                Thread.sleep(5000);
            }
            catch (Exception e){
                System.out.println("Some error");
            }
        }
    }
    public void printStars(){
        for(int i=0;i<=4;i++){
            System.out.println("* ");
            try{
                Thread.sleep(5000);
            }
            catch (Exception e){
                System.out.println("Some error");
            }
        }
    }

    @Override
    public void run() {

        Thread thread = Thread.currentThread();
        if (thread.getName().equals("BANK")){
            banking();
        }
        else if (thread.getName().equals("FOCUS")){
            importantMessage();
        }
        else{
            printStars();
        }

    }
}

public class Telusko001MultiThreadingJoins {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread has started");

        Telusko3 telusko = new Telusko3();

        Thread t1 = new Thread(telusko);
        Thread t2 = new Thread(telusko);
        Thread t3 = new Thread(telusko);

        t1.setName("BANK");
        t2.setName("FOCUS");
        t3.setName("STAR");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Main thread is completed");

    }
}
