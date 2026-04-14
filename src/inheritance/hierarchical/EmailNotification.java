package inheritance.hierarchical;

public class EmailNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
