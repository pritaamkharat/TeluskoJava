package telusko0907;

import java.util.Scanner;

public class Telusko002ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("App started");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Kindly enter Numerator to divide");
            int num1 = scan.nextInt();
            System.out.println("Kindly enter Denominator to divide");
            int num2 = scan.nextInt();

            int res = num1 / num2;
            System.out.println("The Result is : " + res);

            System.out.println("Enter the size of an array : ");
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the element to be inserted in an array");
            int elem = scan.nextInt();
            System.out.println("Enter the position at which the data to be inserted");
            int position = scan.nextInt();
            arr[position] = elem;
        }

        catch (ArithmeticException e){
            System.out.println("Please enter non zero denominator.");
        }

        catch (NegativeArraySizeException e){
            System.out.println("Please enter non negative array size.");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please be within your limits.");
        }

        catch (Exception e){
            System.out.println("Some exception occurred");
        }

        System.out.println("App is terminated smoothly");
    }
}
