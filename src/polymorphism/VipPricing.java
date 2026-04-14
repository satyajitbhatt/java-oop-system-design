package polymorphism;

public class VipPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double amount) {
        return amount * 0.8; // 20% discount for VIP customers
    }
}
