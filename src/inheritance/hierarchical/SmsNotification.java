package inheritance.hierarchical;

public class SmsNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
