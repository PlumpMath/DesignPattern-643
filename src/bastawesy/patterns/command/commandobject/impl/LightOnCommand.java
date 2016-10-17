package bastawesy.patterns.command.commandobject.impl;

import bastawesy.patterns.command.commandobject.Command;
import bastawesy.patterns.command.receiver.Light;

/**
 * Created by ahmed.bastawesy on 9/21/2016.
 * <p>
 * represent command object to turn a light on
 * </p>
 */
public class LightOnCommand implements Command {

    /**  */
    private Light light;

    /**
     * the LightOnCommand object encapsulates turning on action for Light object, so it will need an object form Light class
     * to encapsulate its actions.
     *
     * @param light Light object
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void unDo() {
        light.off();
    }

}
