package abstraction.interface_example;

public class PaymentApplication {

    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(300000.0);

        System.out.println("----------------------------------------------");

        Payment upiPayment = new UpiPayment();
        upiPayment.processPayment(500000.0);

        System.out.println("----------------------------------------------");

        Payment walletPayment = new WalletPayment();
        walletPayment.processPayment(700000.0);
    }
}
