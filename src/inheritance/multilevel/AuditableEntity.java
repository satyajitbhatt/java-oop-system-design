package inheritance.multilevel;

public class AuditableEntity extends BaseEntity {

    protected String createdBy;

    public void audit() {
        System.out.println("Auditing by: " + createdBy);
    }
}
