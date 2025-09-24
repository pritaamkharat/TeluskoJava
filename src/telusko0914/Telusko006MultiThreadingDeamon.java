package telusko0914;

class MSWORD extends Thread{
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("TYPE")){
            typing();
        }
        else if (name.equals("SPELL")) {
            spellCheck();
        }
        else{
            autoSave();
        }

    }

    public void typing(){
        try{
            for(int i=0;i<3;i++){
                System.out.println("Typing.....");
                Thread.sleep(4000);
            }

        }
        catch(Exception e){
            System.out.println("Some error");
        }
    }

    public void spellCheck(){
        try{
            for(int i=0;i<3;i++){
                System.out.println("spellChecking.....");
                Thread.sleep(4000);
            }

        }
        catch(Exception e){
            System.out.println("Some error");
        }
    }

    public void autoSave(){
        try{
            for(int i=0;i<3;i++){
                System.out.println("autoSaving.....");
                Thread.sleep(4000);
            }

        }
        catch(Exception e){
            System.out.println("Some error");
        }
    }
}

public class Telusko006MultiThreadingDeamon {
    public static void main(String[] args) {
        MSWORD t1 = new MSWORD();
        MSWORD t2 = new MSWORD();
        MSWORD t3 = new MSWORD();

        t1.setName("TYPE");
        t2.setName("SPELL");
        t3.setName("SAVE");

        t2.setDaemon(true);
        t3.setDaemon(true);

        t2.setPriority(3);
        t3.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
    }
}
