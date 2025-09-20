package telusko0913;

import java.util.Scanner;

class UnderAgeException extends Exception  {
    public UnderAgeException(String msg){
        super(msg);
    }
}

class OverAgeException extends Exception  {
    public OverAgeException(String msg){
        super(msg);
    }
}

class Applicant{
    int age;
    public void acceptInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        age= scan.nextInt();
    }

//    public void verify() throws Exception{
    public void verify() throws UnderAgeException,OverAgeException{
        if (age<18){
            UnderAgeException uae = new UnderAgeException("You're kid bruh! Have patience");
            throw uae;

        }
        else if (age>60)
        {
            OverAgeException oae = new OverAgeException("Be safe");
            throw oae;

        }
        else {
            System.out.println("Proceed with your application");
        }
    }

}

class RTO{
    public void initiate(){
        Applicant app = new Applicant();

        try {
            app.acceptInput();
            app.verify();
        }
        catch (UnderAgeException | OverAgeException uae){
            System.out.println(uae.getMessage());
            try {
                app.acceptInput();
                app.verify();
            }
            catch (UnderAgeException | OverAgeException ae){
                System.out.println(ae.getMessage());
                try {
                    app.acceptInput();
                    app.verify();
                }
                catch (UnderAgeException | OverAgeException e){
                    System.out.println("Blocked from Applying licence");
                }
            }
        }
    }
}

public class Telusko003CustomException {
    public static void main(String[] args) {
        RTO rto = new RTO();
        rto.initiate();

    }
}
