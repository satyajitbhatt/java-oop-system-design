package inheritance.multilevel;

public class Order extends AuditableEntity {

    private final double amount;

    public Order(Long id, String createdBy, double amount) {
        this.id = id;
        this.createdBy = createdBy;
        this.amount = amount;
    }

    public void process() {
        System.out.println("Processing order: " + amount);
    }
}
