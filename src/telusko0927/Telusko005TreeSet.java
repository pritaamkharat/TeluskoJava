package telusko0927;

import java.util.TreeSet;

public class Telusko005TreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
//        ts.add(4);
//        ts.add(4);
//        ts.add(null);
//        System.out.println(ts);

        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);
        System.out.println("*********************************");
        System.out.println(ts.ceiling(65));  //75
        System.out.println(ts.higher(65));   //75
        System.out.println("*********************************");

        System.out.println(ts.ceiling(75));  //75
        System.out.println(ts.higher(75));   //100
        System.out.println("*********************************");

        System.out.println(ts.ceiling(175));  //175
        System.out.println(ts.ceiling(176));  //null
        System.out.println(ts.higher(175));   //null
        System.out.println("*********************************");

        System.out.println(ts.floor(65));    //50
        System.out.println(ts.lower(65));    //50
        System.out.println("*********************************");

        System.out.println(ts.floor(50));    //50
        System.out.println(ts.lower(50));    //25
        System.out.println("*********************************");

        System.out.println(ts.floor(25));    //25
        System.out.println(ts.lower(25));    //null
        System.out.println(ts.floor(24));    //null
        System.out.println(ts.lower(24));    //null
        System.out.println("*********************************");

        System.out.println(ts.pollFirst());   //it will return you first object of collection by removing it
        System.out.println(ts.pollLast());    //it will return you last object of collection by removing it
        System.out.println(ts);

    }


}
