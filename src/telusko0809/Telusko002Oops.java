package telusko0809;

class Student{
    int id;
    String name;
    int age;
    void sleep(){
        System.out.println("Student is sleeping");
    }

}
public class Telusko002Oops {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.sleep();
    }
}
