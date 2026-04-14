package abstraction.abstract_class;

public class CreditCardPayment extends PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment : " + amount);
    }
}
