package telusko0920.telusko001ObjectLevelLocking;

public class PhonePay extends Thread{
    private HDBCBank bank;

    public PhonePay (HDBCBank bank){
        this.bank= bank;
    }

    public void run() {
        bank.checkBalance();
    }
}
