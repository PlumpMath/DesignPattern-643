package bastawesy.patterns.command.commandobject.impl;

import bastawesy.patterns.command.commandobject.Command;

/**
 * Created by ahmed.bastawesy on 10/16/2016.
 * this class used to create an object - null object - used when you don't have a meaningful object to return
 * and yet you need to remove the responsibility of handling null from the client.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void unDo() {

    }
}
