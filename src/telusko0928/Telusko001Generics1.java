package telusko0928;

import java.util.ArrayList;

class Telusko
{
    int cid;
    String courseName;
    double price;

    public Telusko(int cid, String courseName, double price) {
        this.cid = cid;
        this.courseName = courseName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Telusko{" +
                "cid=" + cid +
                ", courseName='" + courseName + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Telusko001Generics1
{
    public static void main(String[] args)
    {
        //typesafety
        int [] arr = new int[3];
        arr[0]=4;
        arr[1]=5;
        arr[2]=6;

        int data = arr[1];

        //typesafety
        String [] str = new String[3];
        str[0]="Telusko";
        str[1]="Java";
        str[2]="DevOps with AWS";

        String course = str[1];
        course.toUpperCase();

        ArrayList al = new ArrayList();
        al.add("Java");
        al.add("Springboot");
        al.add("AWS");
        al.add(44);

        String data1 = (String) al.get(0);
        data1 = data1.toUpperCase();
        System.out.println(data1);

        String data2 = (String) al.get(1);
        data2 = data2.toUpperCase();
        System.out.println(data2);

        String data3 = (String) al.get(2);
        data3 = data3.toUpperCase();
        System.out.println(data3);

//        String data4 = (String) al.get(3);
//        data4 = data4.toUpperCase();
//        System.out.println(data4);

        //Ensuring type safety
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Java");
        al2.add("Springboot");
        al2.add("AWS");
//        al2.add(44);
        System.out.println(al2);

        ArrayList<Telusko> telusko = new ArrayList<>();
        telusko.add(new Telusko(1,"Java",4545.5));
        telusko.add(new Telusko(2,"AWS",4545.5));
        telusko.add(new Telusko(3,"DevOps",5454.5));

        for (Telusko t: telusko){
            System.out.println(t);
        }

        ArrayList<Integer> al3 = new ArrayList<>();

//        ArrayList<int> al4 = new ArrayList<>();  //primitive is not allowed,it must be reference type
//        Telusko <Integer> t = new Telusko<>(1,"DevOps with AWS",20000);
    }
}
