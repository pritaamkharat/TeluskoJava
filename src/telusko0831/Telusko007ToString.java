package telusko0831;
class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Telusko007ToString {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Samrat",10.001);
        System.out.println(e);

        String str ="Pritam";
        str.concat("satara");
        System.out.println(str);
    }
}
