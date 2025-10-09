package telusko0927;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Telusko009Vector {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(44);
        vector.addElement(54);
        vector.addElement(56);
        System.out.println(vector);

        Enumeration vect =vector.elements();
        while(vect.hasMoreElements()){
            System.out.println(vect.nextElement());
        }

        Iterator vitr = vector.iterator();
        while (vitr.hasNext()){
            System.out.println(vitr.next());
        }
    }
}
