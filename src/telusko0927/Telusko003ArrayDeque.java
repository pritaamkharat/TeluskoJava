package telusko0927;

import java.util.ArrayDeque;

public class Telusko003ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(44);
        ad.add(44);   // duplicates are allowed
        ad.add(45);
//        ad.add(null);   // java.lang.NullPointerException  null not allowed
        System.out.println(ad);
        ad.addFirst(4);
        ad.addLast(5);
        System.out.println(ad);
        ad.removeFirst();
        System.out.println(ad);

    }
}
