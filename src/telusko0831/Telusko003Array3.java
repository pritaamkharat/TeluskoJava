package telusko0831;

import java.util.Scanner;

public class Telusko003Array3 {
    public static void main(String[] args) {
        int [] [] [] arr = new int[2][2][4];
        Scanner scan = new Scanner(System.in);
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                for (int k=0;k<arr[i][j].length;k++){
                    System.out.println("Enter marks of "+i+" school "+j+ " classroom "+k+" student ");
                    arr[i][j][k]=scan.nextInt();
                }
            }
        }

        System.out.println("The marks stored in memory as follows");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print("marks of school "+ i+" class room "+j+" - ");
                for (int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
