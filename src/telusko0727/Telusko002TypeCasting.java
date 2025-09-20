package telusko0727;

public class Telusko002TypeCasting {
    public static void main(String[] args) {
        int a;  //declaration
        a=10; //initializing
        System.out.println(a);

        byte a1= 45;  // --->1
        int b;   // ---->4   //implicit type casting // numeric type promotion
        b=a1;
        System.out.println(b);

        int n1 =4;   // 4 bytes
        double n2;   // 8 bytes
        n2=n1;
        System.out.println(n2);  //4.0

        double num =45.5;
        int num2;
//        num2= num;    //Required type:int Provided:double
        num2 = (int) num;
        System.out.println(num2);   //explicit type casting  // possible loss of precision

        int number1=45;
        byte number2;
//        number2= number1;  //Required type:byte Provided:int
        number2 = (byte) number1;
        System.out.println(number2);  //45
    }
}
