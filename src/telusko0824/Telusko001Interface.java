package telusko0824;

import java.util.Scanner;

interface Calc{
     void add(int n1, int n2);
     // public abstract void add(int n1, int n2);
     int mul();
//     public abstract int mul();
      default void disp(){
          System.out.println("disp of calc");
      }

      static void alien(){
          System.out.println("Static method from interface Calc");
      }

      private void telusko(){

      }

}
interface Calc2{
    double pi= 3.14;
//    public static final double pi=3.14;
    int divide (int n1, int n2);
}

class Telusko{
    public void show(){
        System.out.println("Telusko Java learning");
    }
}

class Mycal1 extends Telusko implements Calc,Calc2{
    int res;
    public void add(int n1, int n2){
        res= n1+n2;
        System.out.println("Result is "+res);

    }
    public int mul(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n1 to be multiplied");
        int n1 = scan.nextInt();
        System.out.println("Enter n2 to be multiplied");
        int n2 = scan.nextInt();
        res = n1*n2;
        return res;
    }
    public void disp(){
        System.out.println("Both addition and multiplication results calculated");
    }

    public int divide(int n1, int n2) {
        return n1/n2;
    }

    static void alien(){
        System.out.println("Static method from Class Mycal1");
    }
}
class Mycal2 implements Calc {
    public void add(int n1, int n2){
        System.out.println("Addition of two number is ");
        int res = n2 + n1;
        System.out.println("The Result of adding "+n1+" and "+n2 + " is "+ res);
    }
    public int mul(){
        int res = 4*4;
        return res;
    }
    public void disp(){
        System.out.println("Addition and multiplication is done differently");

    }
}

public class Telusko001Interface {
    public static void main(String[] args) {
//        Calc c1 = new Mycal1();
//        c1.add(10,20);
//        System.out.println(c1.mul());
//        c1.disp();

        Mycal1 c1 = new Mycal1();
        c1.disp();
        System.out.println(c1.mul());
        c1.add(10,20);
        System.out.println(c1.divide(20,20));
        c1.show();
        c1.alien();  // this is created in Mycal1 class, not from the interface
//        c1.alien();  //Static method may be invoked on containing interface class only
        Calc.alien();

//        Calc c2 = new Mycal2();
//        c2.add(15,15);
//        System.out.println(c2.mul());
//        c2.disp();
    }
}
