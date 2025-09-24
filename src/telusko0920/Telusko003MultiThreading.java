package telusko0920;

class Alpha implements Runnable{

    @Override
    public void run() {
        System.out.println("Task of thread");
    }
}

public class Telusko003MultiThreading {
    public static void main(String[] args) {
//        Alpha alpha = new Alpha();
//        Thread t1 = new Thread(alpha);

//        Thread t1 = new Thread(new Alpha() );

//        Runnable runnable = () -> System.out.println("Task for new Thread");
//        Thread t1 = new Thread(runnable);

//        Thread t1 = new Thread(() -> System.out.println("Task for new Thread"));
//        t1.start();

        new Thread(() -> System.out.println("Task for new Thread")).start();

    }
}
