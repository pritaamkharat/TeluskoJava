package telusko1004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricket
{
    int age;
    String name;
    double avg;

    public Cricket(int age, String name, double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    public String toString() {
        return "Cricket [age=" + age + ", name=" + name + ", avg=" + avg + "]";
    }

}

//implements
//anonymous class
//lambda expression

class Alpha implements Comparator<Cricket>
{
    public int compare(Cricket c1, Cricket c2)
    {
        if (c1.avg>c2.avg)
            return 1;
        else if (c1.avg<c2.avg)
            return -1;
        else
            return 0;
    }

}

public class Telusko002ComplexSorting
{
    public static void main(String[] args)
    {
        Cricket c1 = new Cricket(25,"Rahul",50.5);
        Cricket c2 = new Cricket(30,"Sachin",100.5);
        Cricket c3 = new Cricket(28,"Virat",60.5);
        Cricket c4 = new Cricket(27,"Dhoni",70.5);

        ArrayList<Cricket> al = new ArrayList<>();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        al.add(c4);
        System.out.println(al);
//        Collections.sort(al);  // compile time error
        //Comparator and Comparable interface
        Alpha alpha = new Alpha();
        Collections.sort(al,alpha);
        System.out.println(al);

        Comparator<Cricket> comparator = new Comparator<Cricket>() {
            @Override
            public int compare(Cricket c1, Cricket c2) {
                if (c1.avg>c2.avg)
                    return 1;
                else if (c1.avg<c2.avg)
                    return -1;
                else
                    return 0;
            }
        };
        Collections.sort(al,comparator);
        System.out.println(al);

        //use lambada for above code
        Collections.sort(al,(c5,c6)->{
            if (c5.avg>c6.avg)
                return 1;
            else if (c5.avg<c6.avg)
                return -1;
            else
                return 0;
        });
        System.out.println(al);

        //comparator method is recommended to use when target class is not accessible and modifiable.
        //comparable method is recommended when target class is accessible and modifiable.
        //comparable is used for natural sorting order.
        //comparator is used for custom sorting order.
        //comparable is used for single sorting order.
        //comparator is used for multiple sorting order.
    }
}
