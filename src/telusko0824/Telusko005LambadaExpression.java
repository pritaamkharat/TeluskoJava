package telusko0824;
interface Abc{
    void something(int num);
}

interface Calculator{
    int add(int num1, int num2 );
}

public class Telusko005LambadaExpression {
    public static void main(String[] args) {
        Abc obj = (n) -> {  // If there is only one variable no need to put brackets
            System.out.println("Hello");
        };

        Abc obj2 = n -> {  // If there is only one variable no need to put brackets
            System.out.println("Hello");
        };

        Abc obj3 = n -> System.out.println("Hello");  //No need to put curly brackets
        obj.something(10);

//        Calculator cal = new Calculator() {
//            public int add(int num1, int num2) {
//               return num1+num2;
//            }
//        };

        Calculator cal = ( num1,num2) -> num1+num2;   //No need to write return

        int result = cal.add(10,20);
        System.out.println(result);
    }
}
