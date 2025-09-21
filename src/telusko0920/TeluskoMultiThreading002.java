package telusko0920;

public class TeluskoMultiThreading002 extends Thread{

    public TeluskoMultiThreading002(String name){
        super(name);
    }
    public static void main(String[] args) {
        System.out.println("Main thread started");
        TeluskoMultiThreading002 t1 = new TeluskoMultiThreading002("MyThread1");
        TeluskoMultiThreading002 t2 = new TeluskoMultiThreading002("MyThread2");

//        t1.setName("MyThread1");
//        t2.setName("MyThread2");

        t1.start();
        t2.start();
    }

    public void run() {
        System.out.println("Task for my new Thread");
    }
}
