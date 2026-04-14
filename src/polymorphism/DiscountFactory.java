package polymorphism;

public class DiscountFactory {

    public static PricingStrategy pricingStrategy(String type) {
        return switch (type.toUpperCase()) {
            case "PREMIUM" -> new PremiumPricing();
            case "VIP" -> new VipPricing();
            default -> new RegularPricing();
        };
    }
}
