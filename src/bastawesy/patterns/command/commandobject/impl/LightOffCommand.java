package bastawesy.patterns.command.commandobject.impl;

import bastawesy.patterns.command.commandobject.Command;
import bastawesy.patterns.command.receiver.Light;

/**
 * Created by ahmed.bastawesy on 9/21/2016.
 * represent command object to turn a light off
 */
public class LightOffCommand implements Command {

    private Light light;

    /**
     * the LightOffCommand object encapsulates turning off action of Light object, so it will need an object form Light class
     * to encapsulate its actions.
     *
     * @param light Light object
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void unDo() {
        light.on();
    }
}
