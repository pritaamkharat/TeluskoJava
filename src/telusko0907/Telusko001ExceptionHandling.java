package telusko0907;

import java.util.Scanner;

public class Telusko001ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("App started");
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Kindly enter Numerator to divide");
            int num1 = scan.nextInt();
            System.out.println("Kindly enter Denominator to divide");
            int num2 = scan.nextInt();

            int res = num1/num2;
            System.out.println("The Result is : "+res);
        }
        catch(Exception e)
        {
            System.out.println("Please enter Non Zero Denominator");

        }
        System.out.println("App is terminated smoothly");


    }
}
