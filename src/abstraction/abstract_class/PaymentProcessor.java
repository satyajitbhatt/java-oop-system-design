package abstraction.abstract_class;

public abstract class PaymentProcessor {

    protected String transactionId;

    public PaymentProcessor() {
        this.transactionId = java.util.UUID.randomUUID().toString();
    }

    public abstract void processPayment(double amount);

    public void printTransactionId() {
        System.out.println("Transaction ID : " + transactionId);
    }
}
