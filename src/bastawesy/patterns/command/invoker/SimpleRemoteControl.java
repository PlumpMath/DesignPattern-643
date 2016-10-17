package bastawesy.patterns.command.invoker;

import bastawesy.patterns.command.commandobject.Command;

/**
 * Created by ahmed.bastawesy on 9/21/2016.
 * provides an invoker object responsible for setting command object
 * the invoker objec
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {
    }

    /**
     * set the given command to the slot which is going to control.
     * This could be called multiple time if the client of this code wanted
     * to change the behavior of the remote button.
     *
     * @param command set the given parameter to the slot
     */
    public void setCommand(Command command) {
        this.slot = command;
    }

    /**
     * this method is called when button is pressed.
     * It simply take the current command bound to slot and calls its execute() method.
     * Here we decouple the request of an action from the object the actually perform the action
     * meaning that here we don'e know which Receiver object will be used .
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}
