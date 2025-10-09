package telusko1004;

import java.util.ArrayList;
import java.util.Collections;

class Cricket2 implements Comparable<Cricket2>
{
    int age;
    String name;
    double avg;

    public Cricket2(int age, String name, double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    public String toString() {
        return "Cricket [age=" + age + ", name=" + name + ", avg=" + avg + "]";
    }

    @Override
    public int compareTo(Cricket2 o) {
        // Compare based on age
       if (this.age>o.age){
           return 1;
       }
       else if (this.age<o.age){
           return -1;
       }
       else {
           return 0;
       }
    }

}

public class Telusko003ComplexSorting
{
    public static void main(String[] args)
    {
        Cricket2 c1 = new Cricket2(25,"Rahul",50.5);
        Cricket2 c2 = new Cricket2(30,"Sachin",100.5);
        Cricket2 c3 = new Cricket2(28,"Virat",60.5);
        Cricket2 c4 = new Cricket2(27,"Dhoni",70.5);

        ArrayList<Cricket2> al2 = new ArrayList<>();
        al2.add(c1);
        al2.add(c2);
        al2.add(c3);
        al2.add(c4);
        Collections.sort(al2);
        System.out.println(al2);
    }
}
