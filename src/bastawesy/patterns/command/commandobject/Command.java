package bastawesy.patterns.command.commandobject;

/**
 * Created by ahmed.bastawesy on 9/21/2016.
 * <p>
 * represents an interface containing one method,execute(), which all command objects will implement.
 * </p>
 */
public interface Command {

    /**
     * Encapsulate the actions and can be called to invoke the actions on the receiver object.
     */
    void execute();

    /**
     * Encapsulate the undo actions.
     */
    void unDo();
}
