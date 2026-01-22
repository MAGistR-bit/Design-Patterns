package command.simpleremote.commands;

import command.simpleremote.Command;
import command.simpleremote.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
