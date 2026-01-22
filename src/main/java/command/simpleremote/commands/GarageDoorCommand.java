package command.simpleremote.commands;

import command.simpleremote.Command;
import command.simpleremote.GarageDoor;

public class GarageDoorCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
