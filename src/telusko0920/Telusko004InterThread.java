package telusko0920;

class Producer extends Thread{
    Queue q;
    int i=1;
    public Producer (Queue q){
        this.q=q;
    }

    public void run() {
        while(true){
            q.produce(i++);
        }
    }
}

class Consumer extends Thread{
    Queue q;
    public Consumer (Queue q){
        this.q= q;
    }
    public void run() {
        while(true){
            q.consume();
        }

    }

}

class Queue{
    boolean flag = false;
    int data;
    synchronized public void produce(int i){
        try{
            if (flag){
                System.out.println("Producer in wait state");
                wait();
            }
            else{
                data = i;
                System.out.println("I have produced data "+data);
                flag=true;
                notify();
            }
        }
        catch (Exception e){
            System.out.println("Some problem");
        }
    }
    synchronized public void consume(){
        try{
            if (flag==false){
                System.out.println("Consumer is in wait state");
                wait();
            }
            else {
                System.out.println("I have consumed data "+data);
                flag=false;
                notify();
            }
        }
        catch (Exception e){
            System.out.println("Some problem");
        }
    }
}

public class Telusko004InterThread {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();

    }
}
