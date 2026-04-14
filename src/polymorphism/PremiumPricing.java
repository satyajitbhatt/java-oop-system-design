package polymorphism;

public class PremiumPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double amount) {
        return amount * 0.9; // 10% discount for premium customers
    }
}
