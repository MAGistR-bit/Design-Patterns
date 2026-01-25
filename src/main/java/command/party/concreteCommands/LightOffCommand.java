package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.Light;

/**
 * @author Mikhail
 * <p>Команда для выключения света.</p>
 */
public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    /**
     * Включает выключенный свет.
     */
    @Override
    public void undo() {
        light.on();
    }
}
