package bastawesy.patterns.command.commandobject.impl;

import bastawesy.patterns.command.commandobject.Command;

/**
 * Created by ahmed.bastawesy on 10/16/2016.
 * Macro command represents on command that conatins many commands on it
 * if we execute macro command, actually many commands are executed in one call
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void unDo() {
        for (Command command : commands) {
            command.unDo();
        }
    }
}
