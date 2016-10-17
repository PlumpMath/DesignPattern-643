package bastawesy.patterns.command.receiver;

/**
 * Created by ahmed.bastawesy on 9/21/2016.
 * initialize a receiver object for CeilingFan actions like on and off actions
 */
public class CeilingFan {


    String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    /**
     * represents an action for turning CeilingFan on
     */
    public void on() {
        System.out.println("CeilingFan is turned On");
    }

    /**
     * represents an action for turning CeilingFan off
     */
    public void off() {
        System.out.println("CeilingFan is turned off");
    }
}
