package telusko0920.telusko001ObjectLevelLocking;

public class ATM extends Thread{
    private HDBCBank bank;

    public ATM (HDBCBank bank){
        this.bank= bank;
    }

    public void run() {
        bank.withdrawal(4000);
    }
}
