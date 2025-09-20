package telusko0830;

public class Telusko004FedEx implements Telusko002IDelivery{
    public String deliverTheProduct(double amount) {
        return "Product Delivered with FedEx Successfully and amount paid is "+amount;
    }
}
