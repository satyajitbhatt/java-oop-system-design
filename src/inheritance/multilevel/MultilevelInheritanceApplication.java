package inheritance.multilevel;

public class MultilevelInheritanceApplication {

    public static void main(String[] args) {
        Order order = new Order(111L, "Admin", 3000);
        order.save();
        order.audit();
        order.process();
    }
}
