package telusko0906;

public class Telusko002StringMutable {
    public static void main(String[] args) {
//          StringBuilder  Java5 - 2004
//          StringBuffer   Java 1.0 -1996
        StringBuffer sb = new StringBuffer("Telusko");
        System.out.println(sb);    //Telusko
        System.out.println(sb.hashCode());   //81628611
        sb.append(" Java");
        System.out.println(sb);   //Telusko Java
        System.out.println(sb.hashCode());   //81628611

        StringBuilder sb1 = new StringBuilder("Telusko");
        System.out.println(sb1);    //Telusko
        System.out.println(sb1.hashCode());   //1828972342
        sb1.append(" Java");
        System.out.println(sb1);   //Telusko Java
        System.out.println(sb1.hashCode());   //1828972342

    }

}
