package telusko0920.telusko001ObjectLevelLocking;

public class HDBCBank {
    int accountBal;

    public HDBCBank(int accountBal){
        this.accountBal = accountBal;
    }

    synchronized public void withdrawal (int withdrawal){
        accountBal = accountBal - withdrawal;
    }

    synchronized public void deposit (int deposit){
        accountBal = accountBal + deposit;
    }

    synchronized public void checkBalance(){
        System.out.println("The balance in account is : "+ accountBal);
    }

}
