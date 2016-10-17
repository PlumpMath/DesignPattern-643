package bastawesy.patterns.command.invoker;

import bastawesy.patterns.command.commandobject.Command;
import bastawesy.patterns.command.commandobject.impl.NoCommand;

/**
 * Created by ahmed.bastawesy on 10/16/2016.
 * this class represents an implementation to using  command pattern
 */
public class RemoteControl {
    /**
     * this time aroung the remote is going to handle seven On and Off commands, which
     * we will hold in corresponding arrays .
     */
    Command[] onCommands;
    Command[] offCommands;
    Command unDoCommand;

    public RemoteControl() {
        /** initialize the on and off commands */
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        unDoCommand = noCommand;
    }

    /**
     * takes a slot position and on and off commands to be stored in that slot . It puts these
     * command objects in the on and off arrays for later use
     *
     * @param slot       slot position
     * @param onCommand  to be set to object at the index of slot at onCommands array
     * @param offCommand to be set to object at the index of slot at offCommands array
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * called when on button is pressed on given slot
     *
     * @param slot slot of the on button
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        unDoCommand = onCommands[slot];
    }

    /**
     * called when  off button is pressed on a given slot
     *
     * @param slot slot of the off button
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        unDoCommand = offCommands[slot];
    }

    public void unDoButtonWasPressed() {
        unDoCommand.unDo();
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" \n  romote control \n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[ Slot " + i + " ]").append(onCommands[i].getClass().getSimpleName())
                    .append("              ").append(offCommands[i].getClass().getSimpleName()).append(" \n ");
        }
        return stringBuilder.toString();
    }
}
