package bastawesy.patterns.command.commandobject.impl;

import bastawesy.patterns.command.commandobject.Command;
import bastawesy.patterns.command.receiver.GarageDoor;

/**
 * Created by ahmed.bastawesy on 10/16/2016.
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();

    }

    @Override
    public void unDo() {
        garageDoor.down();
    }
}
