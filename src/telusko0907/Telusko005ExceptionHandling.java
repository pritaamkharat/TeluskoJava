package telusko0907;

import java.util.Scanner;

class Alpha{
    public void alpha() throws ArithmeticException
    {
        System.out.println("App started alpha");
        Scanner scan = new Scanner(System.in);
            System.out.println("Kindly enter Numerator to divide");
            int num1 = scan.nextInt();
            System.out.println("Kindly enter Denominator to divide");
            int num2 = scan.nextInt();

            int res = num1/num2;
            System.out.println("The Result is : "+res);
        System.out.println("Alpha app is terminated smoothly");
    }
}

public class Telusko005ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("Main app started");
        try
        {
            Alpha a = new Alpha();
            a.alpha();
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled in main");
        }

        System.out.println("Main app terminated");
    }
}
