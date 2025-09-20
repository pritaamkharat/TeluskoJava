package telusko0830;

import java.util.Scanner;

public class Telusko008Array1 {
    public static void main(String[] args) {
        System.out.println("Student marks maintenance application");

        int [] marks = new int [4];
        Scanner scan = new Scanner(System.in);

        for (int i=0;i<marks.length;i++){
            System.out.println("Enter marks of student "+i);
            marks[i]=scan.nextInt();
        }

        System.out.println("Marks stored as follows");

        for (int j=0;j<marks.length;j++){
            System.out.print(marks[j]+" ");
        }

    }
}
