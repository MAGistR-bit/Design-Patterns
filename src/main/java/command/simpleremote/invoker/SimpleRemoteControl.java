package command.simpleremote.invoker;

import command.simpleremote.Command;

/**
 * @author Mikhail
 * <p>This is the invoker.</p>
 */
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {

    }

    /**
     * Назначает команду для исполнения.
     * @param command команда
     */
    public void setCommand(Command command) {
        this.slot = command;
    }

    /**
     * Метод, который вызывается при нажатии кнопки.
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}
