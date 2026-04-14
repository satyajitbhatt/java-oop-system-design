package abstraction.abstract_class;

public class UpiPayment extends PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment : " + amount);
    }
}
