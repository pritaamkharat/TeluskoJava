package telusko0824;

class AndroidCall{
    public void call(){
        System.out.println("New UI which is bad");
    }
}

//class MyAndroidCall extends AndroidCall{
//    public void call(){
//        System.out.println("New UI which is good");
//    }
//}

public class Telusko002AnonymousDemo {
    public static void main(String[] args) {
        AndroidCall obj = new AndroidCall()   //Anonymous inner Class
        {
            public void call(){
                System.out.println("New UI which is good");
            }

            public void show(){
                System.out.println("This is show method from anonymous class");
            }
        };
        obj.call();
//        obj.show();

        new AndroidCall()   //Anonymous inner Class
        {
            public void call(){
                System.out.println("New UI which is good");
            }

            public void show(){
                System.out.println("This is show method from anonymous class");
            }
        }.show();


    }
}
