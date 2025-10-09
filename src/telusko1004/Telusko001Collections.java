package telusko1004;

import java.util.ArrayList;
import java.util.Collections;

public class Telusko001Collections {
    public static void main(String[] args) {
        // Collection class in java
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println("**********************");
        Collections.shuffle(al);
        System.out.println(al);
        int result = Collections.frequency(al,150);
        System.out.println(result);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Pritam");
        al2.add("Rajat");
        al2.add("Rahul");
        al2.add("Ravi");
        al2.add("Rajesh");
        al2.add("Rakesh");
        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);
        Collections.shuffle(al2);
        System.out.println(al2);
        int result2 = Collections.frequency(al2,"Rajat");
        System.out.println(result2);

    }
}
