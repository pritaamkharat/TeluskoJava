package telusko0927;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Telusko008Concurrent {
    public static void main(String[] args) {
        CopyOnWriteArrayList al = new CopyOnWriteArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);

        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            al.add(44);  //==> failSafely --> no exception
        }
    }
}
