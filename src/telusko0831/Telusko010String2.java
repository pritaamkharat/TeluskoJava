package telusko0831;

public class Telusko010String2 {
    public static void main(String[] args) {
//        String str= "Telusko";
//        System.out.println(str);
//        str = str + " Java";
//        System.out.println(str);

        String str1= "Telusko";
        String str2 = " Devops with AWS";
        String str3= str1+str2;
        String str4 = str1+str2;
        System.out.println(str3==str4);  //false

        String str5 = "Telusko" + " Devops with AWS";
        String str6 = "Telusko" + " Devops with AWS";
        System.out.println(str5==str6);  //true

        String str = "Pritam";
        str=str.concat(" Kharat");
        System.out.println(str);
    }
}
