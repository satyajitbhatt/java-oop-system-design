package polymorphism;

public class OrderService {

    private final PricingStrategy pricingStrategy;

    public OrderService(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void placeOrder(double amount) {
        double finalPrice = pricingStrategy.calculatePrice(amount);
        System.out.println("Final price : " + finalPrice);
    }
}
