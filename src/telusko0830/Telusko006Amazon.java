package telusko0830;

public class Telusko006Amazon {
    private Telusko002IDelivery delivery;

    public Telusko006Amazon(Telusko002IDelivery delivery){
        this.delivery = delivery;

    }
//    public void setDelivery(Telusko002IDelivery delivery) {
//        this.delivery = delivery;
//    }
    public String productDelivery(double amount){
        return delivery.deliverTheProduct(amount);
    }
}
