package telusko0906;

public class Telusko004StringMutable3 {
    public static void main(String[] args) {
        StringBuffer sb3 = new StringBuffer("Telusko");
//        sb3 = sb3.append("Java");
//        System.out.println(sb3);
//        sb3.reverse();
        System.out.println(sb3);

        StringBuffer sb4 = new StringBuffer("Telusko");
        System.out.println(sb3==sb4);   //false
        System.out.println(sb3.equals(sb4));   //false

        System.out.println(sb3.toString().equals(sb4.toString()));  //true
    }
}
