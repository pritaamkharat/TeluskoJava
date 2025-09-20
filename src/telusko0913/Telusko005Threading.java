package telusko0913;

import java.util.Scanner;

class Alpha{

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
}

public class Telusko005Threading {
    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        alpha.banking();
        alpha.importantMessage();
        alpha.printStars();
    }
}
