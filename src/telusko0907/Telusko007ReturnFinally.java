package telusko0907;
class Alien{
    public int getAge(){
        try {
            return 10;
        }
        finally {
            System.out.println("Statement after return");
//            return 20;
        }
//        System.out.println("100");   we can not write after return , it will leads to compile time error
    }
}

public class Telusko007ReturnFinally {
    public static void main(String[] args) {
        Alien a = new Alien();
        System.out.println(a.getAge());
    }
}
