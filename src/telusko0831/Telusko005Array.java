package telusko0831;

import java.util.Arrays;

class Student{
    int age;
    String name;

}
public class Telusko005Array {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0]=44;

        int arr1[] = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(arr1));

        int arr2[] = {10,20,30};

        Student [] st = new Student[3];
        st[0]= new Student();
        st[1]= new Student();
        st[2]= new Student();

        String [] str = {"Java","Spring boot","Gen AI"};

        for (String s : str){
            System.out.println(s);
        }

        int [][] arr3= {{1,2,3},{5,6,7}};
        for (int [] ar : arr3){
            for (int a: ar){
                System.out.print(a+" ");
            }
            System.out.println();
        }

    }
}
