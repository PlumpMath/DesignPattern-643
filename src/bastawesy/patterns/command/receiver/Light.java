package bastawesy.patterns.command.receiver;

/**
 * Created by ahmed.bastawesy on 9/21/2016.
 * initialize a receiver object for Light actions like on and off actions
 */
public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    /**
     * represents an action for turning light on
     */
    public void on() {
        System.out.println(location + "  is turned On");
    }

    /**
     * represents an action for turning light off
     */
    public void off() {
        System.out.println(location + "  is turned off");
    }
}
