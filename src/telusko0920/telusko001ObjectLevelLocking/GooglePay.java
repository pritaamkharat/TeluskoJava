package telusko0920.telusko001ObjectLevelLocking;

public class GooglePay extends Thread{
    private HDBCBank bank;

    public GooglePay (HDBCBank bank){
        this.bank= bank;
    }

    public void run() {
        bank.deposit(2000);
    }

}
