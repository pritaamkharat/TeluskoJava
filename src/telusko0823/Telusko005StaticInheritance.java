package telusko0823;

class Parent2{
    public static void eats(){
        System.out.println("Parents eat if their children done eating");
    }

//    public void eats(){
//        System.out.println("Parents eat if their children done eating");
//    }
}
class Child extends Parent2{
    public static void eats(){
        System.out.println("child eats based on mood");
    }

//    public void eats(){
//        System.out.println("child eats based on mood");
//    }
}

public class Telusko005StaticInheritance {
    public static void main(String[] args) {
        Child ch1 = new Child();
        ch1.eats();

        Parent2 ch2 = new Child();
        ch2.eats();

    }
}
