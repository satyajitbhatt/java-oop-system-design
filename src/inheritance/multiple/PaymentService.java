package inheritance.multiple;

public class PaymentService implements Auditable, Loggable {

    @Override
    public void audit(String action) {
        System.out.println("Audit : " + action);
    }

    @Override
    public void log(String message) {
        System.out.println("Log : " + message);
    }

    public void processPayment() {
        log("Payment started");
        audit("Processing payment");
        System.out.println("Payment processed");
    }
}
