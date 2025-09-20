package telusko0831;

import java.util.Scanner;

public class Telusko001Array2 {
    public static void main(String[] args) {
        //Array declaration
        int [] [] arr = new int[3][5];
        Scanner scan = new Scanner(System.in);
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.println("Enter marks of class "+ i+" student "+j);
                arr[i][j]=scan.nextInt();
            }
        }

        System.out.println("The marks stored in memory as follows");
        for (int i=0;i< arr.length;i++){
            System.out.print("Marks of class "+ i +" ");
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
