package telusko0831;

public class Telusko008Strings {
    public static void main(String[] args) {
        String str1 = "Telusko";
//
//        String str2 = "Telusko";
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));

//        String str3 = new String("Telusko");
//        String str4 =  new String("Telusko");
//        System.out.println(str3==str4);  //false
//        System.out.println(str3.equals(str4));  //true
//        System.out.println(str1==str3);  //false
//        System.out.println(str1.equals(str3));  //true

        String str5 = "Telusko";
        String str6 = "telusko";
        System.out.println(str5==str6);  //false
        System.out.println(str5.equals(str6));  //false
        System.out.println(str5.equalsIgnoreCase(str6));  //true


    }
}
