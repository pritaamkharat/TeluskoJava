package telusko0920.telusko001ObjectLevelLocking;

public class Telusko001ObjectLevelLocking {
    public static void main(String[] args) {
        HDBCBank bank = new HDBCBank(10000);
        ATM atm = new ATM(bank);
        atm.setName("ATM thread");
        PhonePay phonePay = new PhonePay(bank);
        phonePay.setName("PhonePay thread");
        GooglePay googlePay = new GooglePay(bank);
        googlePay.setName("GooglePay thread");

        atm.start();
        phonePay.start();
        googlePay.start();


    }
}
