package telusko0913;

import java.util.Scanner;

class InvalidCustomerException extends Exception{
    public InvalidCustomerException(String msg){
        super(msg);
    }

}

class ATM{
    private int acc_num = 1234;
    private int pass_wd = 2222;

    int ac;
    int pw;

    public void acceptInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly enter your account number");
        ac=scan.nextInt();
        System.out.println("Kindly enter the password");
        pw= scan.nextInt();
    }

    public void verify() throws InvalidCustomerException {
        if (acc_num==ac && pass_wd==pw){
            System.out.println("Collect your cash");
        }
        else{
            InvalidCustomerException ice = new InvalidCustomerException("Invalid Credential.");
            throw ice;
        }
    }
}

class Bank{
    public void initiate() {
        ATM atm = new ATM();
        try
        {
            atm.acceptInput();
            atm.verify();
        }
//        catch (InvalidCustomerException e)
       catch (InvalidCustomerException e)
        {
            System.out.println(e.getMessage());
//            System.out.println("Invalid Credentials, Try Again");
            try
            {
                atm.acceptInput();
                atm.verify();
            }
            catch (Exception f)
            {
                System.out.println(f.getMessage());
//                System.out.println("Invalid Credentials, Try Again");
                try
                {
                    atm.acceptInput();
                    atm.verify();
                }
                catch (Exception g)
                {
                    System.out.println(g.getMessage());
                    System.out.println("You are legend! I will not allow you to access this Blocked");

                }
            }
        }
    }
}

public class Telusko002CustomException {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.initiate();

    }
}
