package inheritance.hierarchical;

public class HierarchicalInheritanceApplication {

    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SmsNotification();

        email.send("Order Confirmed");
        sms.send("OTP : 445566");
    }
}
