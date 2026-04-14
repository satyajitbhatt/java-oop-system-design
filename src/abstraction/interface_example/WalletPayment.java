package abstraction.interface_example;

public class WalletPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing wallet payment of " + amount);
    }
}
