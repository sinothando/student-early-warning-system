package creational_patterns;

public class AlertPrototype implements Cloneable {
    private String message;

    public AlertPrototype(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public AlertPrototype clone() {
        try {
            return (AlertPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
