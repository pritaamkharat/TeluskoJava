package telusko0803;

public class Telusko002TernaryOperators {
    public static void main(String[] args) {
        int num1= 10;
        int num2= 5;
        int res = (num1>num2)? num1-num2 : num1+num2;
        System.out.println(res);

        if (num1>num2){
            int res1= num1-num2;
            System.out.println("result is "+ res1);
        }
        else {
            int res2= num1+num2;
            System.out.println("result is "+ res2);
        }
    }
}
