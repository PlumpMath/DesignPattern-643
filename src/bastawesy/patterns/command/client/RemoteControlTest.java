package bastawesy.patterns.command.client;

import bastawesy.patterns.command.commandobject.Command;
import bastawesy.patterns.command.commandobject.impl.LightOffCommand;
import bastawesy.patterns.command.commandobject.impl.LightOnCommand;
import bastawesy.patterns.command.invoker.SimpleRemoteControl;
import bastawesy.patterns.command.receiver.Light;

/**
 * Created by ahmed.bastawesy on 9/21/2016.
 * <p>
 * this is our client on the command pattern
 * it creates the command object by calling the setCommand() method on
 * an invoker object which will be in this case calling #{@link SimpleRemoteControl#setCommand(Command)}
 * on #{@link SimpleRemoteControl} object
 * </p>
 */
public class RemoteControlTest {

    /**
     * simulate the required action behavior
     */
    public void onButtonClick() {
        /** create invoker object */
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        /** create receiver object */
        Light light = new Light("");

        /** create command object*/
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        /** set lightOnCommand to slot in simpleRemoteControl object */
        simpleRemoteControl.setCommand(lightOnCommand);

        /** simulate button pressing behavior
         * in this case it will be turning light onF
         */
        simpleRemoteControl.buttonWasPressed();


        /** create another command object */
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        /** set lightOffCommand to slot in simpleRemoteControl object */
        simpleRemoteControl.setCommand(lightOffCommand);

        /** simulate button pressing behavior
         *  in this case, it will be turing light off
         */
        simpleRemoteControl.buttonWasPressed();

    }
}
