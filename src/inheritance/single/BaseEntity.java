package inheritance.single;

public class BaseEntity {

    protected Long id;

    public void save() {
        System.out.println("Saving entity with id : " + id);
    }
}
