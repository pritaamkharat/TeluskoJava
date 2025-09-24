package telusko0914;

//Method level and block level blocking

class MyCar implements Runnable{
//    synchronized public void run (){
//        try{
//            System.out.println(Thread.currentThread().getName()+" has entered parking lot");
//            Thread.sleep(4000);
//            System.out.println(Thread.currentThread().getName()+" has entered into car");
//            Thread.sleep(4000);
//            System.out.println(Thread.currentThread().getName()+" has started to drive the car");
//            Thread.sleep(4000);
//            System.out.println(Thread.currentThread().getName()+" has come back and parked the car");
//            Thread.sleep(4000);
//        }

        public void run (){
            try{
                System.out.println(Thread.currentThread().getName()+" has entered parking lot");
                Thread.sleep(4000);
                synchronized (this) {
                    System.out.println(Thread.currentThread().getName() + " has entered into car");
                    Thread.sleep(4000);
                    System.out.println(Thread.currentThread().getName() + " has started to drive the car");
                    Thread.sleep(4000);
                    System.out.println(Thread.currentThread().getName() + " has come back and parked the car");
                    Thread.sleep(4000);
                }
            }
        catch (Exception e){
            System.out.println("Some Problem");

        }
    }
}

public class Telusko004MultiThreading {
    public static void main(String[] args) {

        MyCar car = new MyCar();

        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);

        t1.setName("RAMESH");
        t2.setName("DINESH");
        t3.setName("SURESH");

        t1.start();
        t2.start();
        t3.start();
    }
}
