package telusko0921;

class Animal{
    public void animalHuntsAndEats(){
        System.out.println("Animal is eating....");
    }
}
class Tiger extends Animal{
    @Override
    public void animalHuntsAndEats(){
        System.out.println("Tiger roars and hunts and eats");
    }
}

public class Telusko005Annotations {
    public static void main(String[] args) {

        Animal animal = new Tiger();
        animal.animalHuntsAndEats();

    }
}
