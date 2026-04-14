package inheritance.single;

public class User extends BaseEntity {

    private final String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("User : " + name);
    }
}
