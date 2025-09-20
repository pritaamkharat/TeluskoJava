package telusko0913;

import java.sql.SQLOutput;
import java.util.Scanner;

class UnderAgeException1 extends Exception  {
    public UnderAgeException1(String msg){
        super(msg);
    }
}

class OverAgeException1 extends Exception  {
    public OverAgeException1(String msg){
        super(msg);
    }
}

class Applicant1{
    int age;
    public void acceptInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        age= scan.nextInt();
    }

    //    public void verify() throws Exception{
    public void verify() throws UnderAgeException1,OverAgeException1{
        if (age<18){
            UnderAgeException1 uae = new UnderAgeException1("You're kid bruh! Have patience");
            throw uae;

        }
        else if (age>60)
        {
            OverAgeException1 oae = new OverAgeException1("Be safe");
            throw oae;

        }
        else {
            System.out.println("Proceed with your application");
        }
    }

}

class RTO1{
    public void initiate(){
        Applicant1 applicant1 = new Applicant1();

        try {
            applicant1.acceptInput();
            applicant1.verify();
        }
       catch(UnderAgeException1 uae){
           System.out.println(uae.getMessage());
           try {
               applicant1.acceptInput();
               applicant1.verify();
           }
           catch(UnderAgeException1 ae){
               System.out.println(ae.getMessage());
               System.out.println("Blocked");

           }
           catch(OverAgeException1 ae){
               System.out.println(ae.getMessage());
               System.out.println("Blocked");
           }

       }
        catch(OverAgeException1 oae){
            System.out.println(oae.getMessage());
            try {
                applicant1.acceptInput();
                applicant1.verify();
            }
            catch(UnderAgeException1 ae){
                System.out.println(ae.getMessage());
                System.out.println("Blocked");
            }
            catch(OverAgeException1 ae){
                System.out.println(ae.getMessage());
                System.out.println("Blocked");
            }

        }
    }
}

public class Telusko004CustomException {
    public static void main(String[] args) {
        RTO1 rto1 = new RTO1();
        rto1.initiate();

    }
}
