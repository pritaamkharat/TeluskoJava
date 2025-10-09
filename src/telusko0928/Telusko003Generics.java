package telusko0928;

import java.util.ArrayList;
import java.util.List;

class Human
{
    int age;
    public void disp(){
        System.out.println("Humans are best creators");
    }
}

class Student extends Human
{

}

class Employee
{

}

public class Telusko003Generics {
    public static void main(String[] args) {
        //wild card //upperbound //lowerbound
        Object obj = new Object();
        String str = new String("Java");

        obj=str;
//        str=obj;

        Human human = new Human();
        Student stu = new Student();
        human = stu;
//        stu = human;

//        ArrayList<Human> humanList = new ArrayList<>();
//        ArrayList<Student> studentList = new ArrayList<>();
//
//        humanList = studentList;   // compile time error
//
//        ArrayList<?> humanList = new ArrayList<>();
//        ArrayList<Student> studentList = new ArrayList<>();
//
//        humanList = studentList;   // unknown ---> ? ---> wildcard

//        ArrayList<? extends Human> humanList = new ArrayList<>();   //upperbound
//        ArrayList<Student> studentList = new ArrayList<>();
//        ArrayList<Employee> empList = new ArrayList<>();
//
//        humanList = studentList;
//        humanList = empList;  // compile time error

//        ArrayList<? super Human> humanList = new ArrayList<>();   //lowerbound
//        ArrayList<Student> studentList = new ArrayList<>();
//        ArrayList<Employee> empList = new ArrayList<>();
//        ArrayList<Object> objList = new ArrayList<>();

//        humanList = studentList;
//        humanList = empList;  // compile time error
//        humanList = objList;

        ArrayList<Human> humanList = new ArrayList<>();
        humanList.add(new Human());
        humanList.add(new Human());

        ArrayList<Student> studList = new ArrayList<>();
        studList.add(new Student());
        studList.add(new Student());

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee());
        empList.add(new Employee());

        ArrayList<Object> objList = new ArrayList<>();
        objList.add(new Object());
        objList.add(new Object());

        alien(humanList);
//        alien(studList);
        alien(objList);
//        alien(empList);
    }

//    public static void alien (List <Human> list)
//    public static void alien (List <? extends Human> list)
    public static void alien (List <? super Human> list)
//    public static void alien (List <? Human> list)
    {
//        for (Human u : list){
//            System.out.println(u);
//        }
    }
}
