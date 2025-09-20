package telusko0823;
abstract class Animal2{
//    abstract int a; //illegal
    public abstract void eat();
    public abstract void sleep();

    public void run(){
        System.out.println("Animal runs to survive");
    }
}

class Lion2 extends Animal2 {
    public void eat(){
        System.out.println("Lion hunts and eats");
    }
    public void sleep(){
        System.out.println("Lion roars and sleep");

    }
}
class Deer2 extends Animal2 {
    public void eat(){
        System.out.println("Deer grazes and eats");
    }
    public void sleep(){
        System.out.println("Deer sleeps less");

    }
}
class Monkey2 extends Animal2 {
    public void eat(){
        System.out.println("Monkey steals and eats");
    }
    public void sleep(){
        System.out.println("Monkey sleeps like humnas");

    }
}

class Forest2{
    public void permits(Animal2 animal){
        animal.eat();
        animal.sleep();
    }
}
public class Telusko003Abstraction {
    public static void main(String[] args) {
        Lion2 lion = new Lion2();

        Deer2 deer = new Deer2();

        Monkey2 monkey = new Monkey2();

        Forest2 f2 = new Forest2();
        f2.permits(lion);
        f2.permits(deer);
        f2.permits(monkey);

//        Animal2 ani = new Animal2();  //'Animal2' is abstract; cannot be instantiated
    }
}
