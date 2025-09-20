package telusko0831;

import java.util.Arrays;

public class Telusko006Array {
    public static void main(String[] args) {
//       Vijay v = new Vijay();

        int ar[] = new int[2];

        String name = ar.getClass().getName();
        System.out.println(name); //[I

        int [][] arr= new int[3][3];
        String name1 = arr.getClass().getName();
        System.out.println(name1);  //[[I

        int [] a= {44,54,65,34};
        for (int n:a){
            System.out.print(n+" ");
        }
        Arrays.sort(a);

        for (int n:a){
            System.out.print(n+" ");
        }
        System.out.println();

        System.out.println(Arrays.toString(a));
    }
}
