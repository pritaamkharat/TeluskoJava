package telusko0914;

import java.util.Scanner;

class Alpha2 implements Runnable{

    public void run() {
        banking();
    }

    public void banking() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Account Number");
        int acc = scan.nextInt();
        System.out.println("Enter password");
        int pw = scan.nextInt();
        System.out.println("Collect your cash");
    }

}

class Beta1 implements Runnable {

    public void run() {
        importantMessage();
    }
    public void importantMessage() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Focus is a key to master any skill");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("Some error");
            }
        }
    }

}

class Gamma1 implements Runnable {

    public void run() {
        printStars();
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
}


public class Telusko002MultiThreading {
    public static void main(String[] args) {

        Alpha2 alpha2 = new Alpha2();
        Beta1 beta1 = new Beta1();
        Gamma1 gamma1 = new Gamma1();

        Thread t1 = new Thread(alpha2);
        Thread t2 = new Thread(beta1);
        Thread t3 = new Thread(gamma1);

        t1.start();
        t2.start();
        t3.start();



    }
}
