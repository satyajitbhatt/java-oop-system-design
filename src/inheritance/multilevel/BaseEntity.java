package inheritance.multilevel;

public class BaseEntity {

    protected Long id;

    public void save() {
        System.out.println("Saving base entity");
    }
}
