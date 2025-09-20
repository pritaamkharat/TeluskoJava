package telusko0823;
class Animal1{
    public void eat(){
        System.out.println("Animals eats to survive");
    }
    public void sleep(){
        System.out.println("Animals need to sleep to be alive");

    }
}

class Lion extends Animal1 {
    public void eat(){
        System.out.println("Lion hunts and eats");
    }
    public void sleep(){
        System.out.println("Lion roars and sleep");

    }
}
class Deer1 extends Animal1 {
    public void eat(){
        System.out.println("Deer grazes and eats");
    }
    public void sleep(){
        super.eat();
        System.out.println("Deer sleeps less");

    }
}
class Monkey extends Animal1 {
    public void eat(){
        System.out.println("Monkey steals and eats");
    }
    public void sleep(){
        System.out.println("Monkey sleeps like humnas");

    }
}

class Forest{
    public void permits(Animal1 animal){
        animal.eat();
        animal.sleep();
    }
}

public class Telusko002Polymorphism {
    public static void main(String[] args) {
        Lion lion = new Lion();

        Deer1 deer = new Deer1();

        Monkey monkey = new Monkey();

        //Method1
        System.out.println("*********Method1*************");
        lion.eat();
        lion.sleep();

        deer.eat();
        deer.sleep();

        monkey.eat();
        monkey.sleep();

        System.out.println("**********Method2************");
        //Method2
        Animal1 animal;
        animal=lion;
        animal.eat();
        animal.sleep();

        animal=deer;
        animal.eat();
        animal.sleep();

        animal=monkey;
        animal.eat();
        animal.sleep();

        //Method3
        System.out.println("*********Method3**********");
        Forest f1 = new Forest();
        f1.permits(lion);
        f1.permits(deer);
        f1.permits(monkey);
    }
}
