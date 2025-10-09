package telusko0927;

import java.util.ArrayList;

public class Telusko001ArrayList
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
//        List ls = new ArrayList();
        al.add("Telusko");
        al.add("Telusko");
        al.add(1);
        al.add(0,100);
        al.add(44.5);
        al.add(true);
        al.add(54);
        al.add('t');
//        al.forEach(a -> System.out.println(a));
        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add("Telusko Course");
        al2.add("SpringBoot Spring AI");
        al2.add("DevOps with AWS");
        al2.add("AI Engineering");
        al2.add(null);

        System.out.println(al2);

        al2.addAll(al);
        al2.add(1,"Prompt Engineering Course");
        System.out.println(al2);
    }
}
