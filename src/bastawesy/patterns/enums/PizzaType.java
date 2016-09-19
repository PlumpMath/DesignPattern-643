package bastawesy.patterns.enums;

/**
 * enum conating different types of pizza
 * Created by ahmed.bastawesy on 8/25/2016.
 */
public enum PizzaType {
    CHEESE(0),
    GREEK(1),
    PEPPERONI(2);
    private final int type;

    PizzaType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
