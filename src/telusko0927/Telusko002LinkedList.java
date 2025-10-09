package telusko0927;

import java.util.LinkedList;
import java.util.List;

public class Telusko002LinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
        ll.add(2,44);
        System.out.println(ll);
        ll.addFirst(4);
        ll.addLast(5);
        ll.add(4);
        ll.add(null);
        System.out.println(ll);
        System.out.println(ll.get(4));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.offer(44);
        ll.offerFirst(45);
        ll.offerLast(54);
        System.out.println(ll);


    }
}
