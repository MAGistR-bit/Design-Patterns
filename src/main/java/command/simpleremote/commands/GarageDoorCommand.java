package command.simpleremote.commands;

import command.Command;
import command.GarageDoor;

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
