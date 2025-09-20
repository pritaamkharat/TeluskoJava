package telusko0802;

public class Telusko002LogicalOperators {
    public static void main(String[] args) {
//        int age = 16;
//        if (age>=18 && age<=60){
//            System.out.println("Legal age : apply for driving licence");
//        }
//        else {
//            System.out.println("You can not apply for driving licence due to age");
//        }

//        int age = 16;
//        if (age>=18){
//            if (age<=60){
//                System.out.println("Legal age : apply for driving licence");
//            }
//            else{
//                System.out.println("You are too old to apply for driving licence");
//            }
//
//        }
//        else {
//            System.out.println("You can not apply for driving licence due to age");
//        }

        int age = 17;
        if (age>=18){
            if (age<=60){
                System.out.println("Legal age : apply for driving licence");
            }
            else{
                System.out.println("You are too old to apply for driving licence");
            }

        }
        else if (age == 17) {
            System.out.println("You can apply for learner driving licence");
        }
        else{
            System.out.println("You can not apply for driving licence due to age");
        }
    }
}
