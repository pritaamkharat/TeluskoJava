package telusko0831;

import java.util.Locale;

public class Telusko009String1 {
    public static void main(String[] args) {
        String str = "RajaRamMohanRoy";
//        char [] arr= str.toCharArray();
//        int b=0;
//        for (char a:arr){
//            b++;
//        }
//        System.out.println(b);
//        System.out.println(str.length());
//        System.out.println(str.toUpperCase());  //RAJARAMMOHANROY
//        System.out.println(str.toLowerCase());  //rajarammohanroy
//        System.out.println(str.substring(0,4));
//        System.out.println(str.charAt(4));  //R
//        System.out.println(str.startsWith("R"));  //true
//        System.out.println(str.startsWith("Ram"));  //false
//        System.out.println(str.startsWith("Raj"));  //true
        System.out.println(str.endsWith("RajaRamMohanRoy"));  //true
        System.out.println(str.endsWith("MohanRoy"));  //true
        System.out.println(str.endsWith("Roy"));  //true
        System.out.println(str.indexOf("R"));   //0
        System.out.println(str.indexOf("R",2));   //4
        System.out.println(str.lastIndexOf("a"));  //10

        char [] arr = str.toCharArray();
        for (char a:arr){
            System.out.println(a);
        }




    }
}
