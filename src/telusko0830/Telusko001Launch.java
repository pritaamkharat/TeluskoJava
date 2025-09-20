package telusko0830;

class Alpha{
    public void alpha(){
        System.out.println("alpha business method");
    }

}

class Beta extends Alpha{
    public void beta(){
//        Alpha alpha = new Alpha();
//        alpha.alpha();   //using composition
        alpha();   // using extends
    }

}

public class Telusko001Launch {
    public static void main(String[] args) {

        Beta beta = new Beta();
        beta.beta();

//        Telusko006Amazon amazon = new Telusko006Amazon();  //This is target object because we are using logic of other class in it.
        Telusko006Amazon amazon = new Telusko006Amazon(new Telusko003BlueDart());  //constructor injection
        //Logic or method of FedEx,BlueDart and FirstFlight is getting used.
//        amazon.setDelivery(new Telusko004FedEx());  // this is called as dependent object.

//        new Telusko004FedEx() -- dependent object
//        dependency injection
//        amazon.setDelivery(new Telusko003BlueDart());
//        amazon.setDelivery(new Telusko005FirstFlight());  //setter injection
        String result = amazon.productDelivery(10);
        System.out.println(result);

    }
}
