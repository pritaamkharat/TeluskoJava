package telusko0823;

//final class Human1
class Human1{
    final double pie = 3.14;
    public  final void cry(){
//        pie= 4.14;  //Cannot assign a value to final variable 'pie'
        System.out.println("Humans cry alot");
    }
}

class Employee1 extends Human1 // Cannot inherit from final 'telusko0823.Human1' if we make Human1 final
         {
//    public void cry(){  //'cry()' cannot override 'cry()' in 'telusko0823.Human1'; overridden method is final
//        System.out.println("Employee cry more about everything");
//    }
}

public class Telusko004Final {
    public static void main(String[] args) {
        Human1 human = new Employee1();
        human.cry();
    }
}
