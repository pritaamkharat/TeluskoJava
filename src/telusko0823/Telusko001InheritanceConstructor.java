package telusko0823;

class Demo1{
    int a, b;
    public Demo1(){
        System.out.println("Zero parameterised constructor Demo1");
        a=10;
        b=20;
    }
    public Demo1(int a, int b){
        System.out.println("Parameterised constructor of Demo1");
        this.a= a;
        this.b= b;
    }
}

class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
//        super(15,25);
        System.out.println("Zero parameterised constructor of Demo2");
        m=4;
        n=44;
    }
    public Demo2(int m, int n){
        this();
        System.out.println("Parameterised constructor of Demo2");
        this.m=m;
        this.n=n;
    }

    public void disp(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("m: "+m);
        System.out.println("n: "+n);
    }
}

public class Telusko001InheritanceConstructor {
    public static void main(String[] args) {
//        Demo2 d2 = new Demo2();
//        d2.disp();
        Demo2 d3 = new Demo2(10,20);
        d3.disp();
    }
}
