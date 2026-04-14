package inheritance.single;

public class SingleInheritanceApplication {

    public static void main(String[] args) {
        User user = new User(1L, "Sample Name");
        user.save();
        user.display();
    }
}
