package telusko0824;

abstract class Phone{
    abstract void connect();
}

//class MyPhone extends Phone{
//    public void connect(){
//        System.out.println("calling my best bud");
//    }
//}

public class Telusko003AbstractAnonymousDemo {
    public static void main(String[] args) {
//        Phone obj = new MyPhone();
//        obj.connect();



        Phone ph = new Phone() {
            void connect() {
                System.out.println("calling my best bud");
            }
        };
        ph.connect();

    }
}
