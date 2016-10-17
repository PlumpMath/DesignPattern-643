package bastawesy.patterns.command.commandobject.impl;

import bastawesy.patterns.command.commandobject.Command;
import bastawesy.patterns.command.receiver.GarageDoor;

/**
 * Created by ahmed.bastawesy on 10/16/2016.
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void unDo() {
        garageDoor.up();
    }
}
