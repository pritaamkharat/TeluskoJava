package telusko0914;

import java.util.Scanner;

class Alpha1 extends Thread{

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

class Beta extends Thread {

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

class Gamma extends Thread{

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



public class Telusko001MultiThreading {

    public static void main(String[] args) {
        Alpha1 alpha1 = new Alpha1();
        Beta beta = new Beta();
        Gamma gamma = new Gamma();

        alpha1.start();
        beta.start();
        gamma.start();


    }
}
