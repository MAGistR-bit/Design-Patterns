package command.simpleremote.commands;

import command.simpleremote.Command;
import command.simpleremote.Light;

/**
 * @author Mikhail
 * <p>Реализация команды для включения света.</p>
 */
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * Метод объекта-получателя для включения света.
     */
    @Override
    public void execute() {
        light.on();
    }
}
