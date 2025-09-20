package telusko0824;

interface Phone1{
    void connect();
//    void something();  // This will give compile time error If we are using lambada expression
}

//class Myphone implements Phone1{
//    public void connect(){
//        System.out.println("Overridden method in class");
//    }
//}

public class Telusko004InterfaceAnonymousDemo {
    public static void main(String[] args) {
//        Phone1 ph = new Myphone();
//        ph.connect();

//        Phone1 ph = new Phone1() {
//            public void connect() {
//                System.out.println("Overridden method in class");
//            }
//        };

        Phone1 ph = () -> System.out.println("No suggestion from AI");
        ph.connect();
    }
}
