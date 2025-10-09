package telusko0927;

import java.util.ArrayList;
import java.util.ListIterator;

public class Telusko007AccessingData {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);

        //create list of random numbers


//        System.out.println(al);

//        for (Object a :al){
//            System.out.println(a);
//        }

//        Iterator it = al.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next() );
//        }

//        for (int i=0;i<al.size();i++){
//            System.out.println(al.get(i));
//            al.add(44);
//        }

//        Iterator it = al.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());  //100
//            al.add(44);   //ConcurrentModificationException  failFast
//        }

        ListIterator litr = al.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }

        ListIterator litr2 = al.listIterator(al.size());
        while(litr2.hasPrevious()){
            System.out.println(litr2.previous());
        }

    }
}
