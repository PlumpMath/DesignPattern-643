package bastawesy.patterns.command.receiver;

/**
 * Created by ahmed.bastawesy on 9/21/2016.
 * initialize a receiver object for GarageDoor actions like on and off actions
 */
public class GarageDoor {

    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    /**
     * represents an action for up action
     */
    public void up() {
        System.out.println("GarageDoor is up");
    }

    /**
     * represents an action for down action
     */
    public void down() {
        System.out.println("GarageDoor is down");
    }
}
