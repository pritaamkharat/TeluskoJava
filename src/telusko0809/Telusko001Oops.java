package telusko0809;

class Dog{
    String name;
    int cost;
    int age;

    //does

    void bark(){
        System.out.println("Barking");
    }

    void sleep(){
        System.out.println("Dog is sleeping");
    }
}

public class Telusko001Oops {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.sleep();
    }
}
