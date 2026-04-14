package polymorphism;

public class PricingApplication {

    public static void main(String[] args) {
        OrderService regularOrder =
                new OrderService(new RegularPricing());

        OrderService premiumOrder =
                new OrderService(new PremiumPricing());

        OrderService vipOrder =
                new OrderService(new VipPricing());

        regularOrder.placeOrder(3000);
        premiumOrder.placeOrder(5000);
        vipOrder.placeOrder(10000);

        // If we want to use DiscountFactory, we can do it like this
        String customerType = "VIP";

        PricingStrategy pricingStrategy =
                DiscountFactory.pricingStrategy(customerType);

        OrderService orderService =
                new OrderService(pricingStrategy);

        System.out.println("------------------------------");
        System.out.println("Using DiscountFactory for customer type: " + customerType);
        orderService.placeOrder(2000);
    }
}
