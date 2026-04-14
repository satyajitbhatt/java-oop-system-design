package abstraction.abstract_class;

public class PaymentApplication {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new CreditCardPayment();
        paymentProcessor.processPayment(15000);
        paymentProcessor.printTransactionId();

        System.out.println("-----------------------------");

        PaymentProcessor processor = new UpiPayment();
        processor.processPayment(20000);
        processor.printTransactionId();
    }
}
