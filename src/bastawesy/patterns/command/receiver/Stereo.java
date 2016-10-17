package bastawesy.patterns.command.receiver;


/**
 * Created by ahmed.bastawesy on 10/16/2016.
 * initialize a receiver object for Stereo actions like on, off, setCd, setDvd, setRadio, setVolume actions
 */
public class Stereo {

    String location;
    int volume;

    public Stereo(String location) {
        this.location = location;
    }

    /**
     * represents an action for turning Stereo on
     */
    public void on() {
        System.out.println("Stereo is turned On");
    }

    /**
     * represents an action for turning Stereo off
     */
    public void off() {
        System.out.println("Stereo is turned off");
    }

    /**
     * represents an action for setCd
     */
    public void setCd() {
        System.out.println("Stereo is setting Cd");
    }

    /**
     * represents an action for setDvd
     */
    public void setDvd() {
        System.out.println("Stereo is setting Dvd");
    }

    /**
     * represents an action for setRadio
     */
    public void setRadio() {
        System.out.println("Stereo is setting Radio");
    }

    /**
     * represents an action for setVolume
     */
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo is setting Volume to " + volume);
    }


}
