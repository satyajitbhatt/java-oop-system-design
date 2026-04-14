package polymorphism;

public class RegularPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double amount) {
        return amount;
    }
}
