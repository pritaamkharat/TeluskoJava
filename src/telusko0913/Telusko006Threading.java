package telusko0913;

public class Telusko006Threading {
    public static void main(String[] args) throws Exception{
        System.out.println("App started....");

        Thread thread = new Thread();
        String name = thread.getName();
        System.out.println("Thread name is : "+name);

        int priority = thread.getPriority();
        System.out.println("Thread priority is : "+priority);
        Thread.sleep(5000);

        System.out.println("***********************");
        thread.setName("Telusko");
        thread.setPriority(4);

        String name1 = thread.getName();
        System.out.println("Thread name is : "+name1);

        int priority1 = thread.getPriority();
        System.out.println("Thread priority is : "+priority1);

        System.out.println("App is terminated");

        System.out.println("push from pritam");
    }
}
