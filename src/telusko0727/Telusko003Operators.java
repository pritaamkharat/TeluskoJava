package telusko0727;

public class Telusko003Operators {
    public static void main(String[] args) {
        int num=5;
        //num= num+1;
        //num++;
        //++num;
        //--num;
        //num--;
        //System.out.println(num);

        int a=5;
        int b;

//        b= a++;  // a 6 b 5
//        b= ++a;  // a 6 b 6
//        b = ++a + ++a + a++ + a++ + ++a;   //a 10 b 38
        //6+7+7+8+10
//        b = a++ + a++ + --a + --a + a-- + a++; // a 5 b 31
        //5 6 6 5 5 4
//        b = a++ + --a + --a + a++ + a++ + a++ - a--;  // a 6 b 22
        // 5 5 4 4 5 6 7
//        b = a++ + a-- + --a + --a + a++ + a++ - a++;  // a 6 b 20
        //5 6 4 3 3 4 5
//        System.out.println("value of a is "+a);
//        System.out.println("value of b is "+b);

        //Arithmetic operator
        // + - * / %

        int num1 = 5;
        int num2 = 4;
        System.out.println(num1+num2);
        System.out.println(4-2);
        System.out.println(4*4);
        System.out.println(4/4);
        System.out.println(10%2); //0
        System.out.println(5%2); //1
        System.out.println(2%5); //2
        System.out.println(10%5);  //0
        System.out.println(5%10);  //5
    }
}
