package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.Light;

/**
 * @author Mikhail
 * <p>Команда для включения света.</p>
 */
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
