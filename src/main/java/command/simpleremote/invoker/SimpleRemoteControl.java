package command.simpleremote.invoker;

import command.Command;

/**
 * @author Mikhail
 * <p>This is the invoker.</p>
 */
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
