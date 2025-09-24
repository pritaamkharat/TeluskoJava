package telusko0914;

//deadlock

class Library implements Runnable{

    String java = new String("JAVA");
    String dsa = new String("DSA");
    String aws = new String("AWS");
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("AMAN")){
            try{
                System.out.println("AMAN got into library");
                Thread.sleep(4000);
                synchronized (java){
                    System.out.println("Aman has acquired java book");
                    Thread.sleep(4000);
                    synchronized (dsa){
                        System.out.println("Aman has acquired dsa book");
                        Thread.sleep(4000);
                        synchronized (aws){
                            System.out.println("Aman has acquired aws book");
                        }
                    }
                }

            }
            catch(Exception e){
                System.out.println("Some problem");
            }

        }
        else{
            try{
                System.out.println("Vijay got into library");
                Thread.sleep(4000);
                synchronized (aws) {
                    System.out.println("Vijay has acquired aws book");
                    Thread.sleep(4000);
                    synchronized (dsa) {
                        System.out.println("Vijay has acquired dsa book");
                        Thread.sleep(4000);
                        synchronized (java) {
                            System.out.println("Vijay has acquired java book");
                        }
                    }
                }
            }
            catch(Exception e1) {
                System.out.println("Some problem");
            }
        }
    }
}

public class Telusko005MultiThreadingStates {
    public static void main(String[] args) {

        Library lib = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("AMAN");
        t2.setName("VIJAY");

        t1.start();
        t2.start();



    }
}
