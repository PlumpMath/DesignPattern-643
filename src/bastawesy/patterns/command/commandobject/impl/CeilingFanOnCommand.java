package bastawesy.patterns.command.commandobject.impl;

import bastawesy.patterns.command.commandobject.Command;
import bastawesy.patterns.command.receiver.CeilingFan;

/**
 * Created by ahmed.bastawesy on 10/16/2016.
 */
public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void unDo() {
        ceilingFan.off();
    }
}
