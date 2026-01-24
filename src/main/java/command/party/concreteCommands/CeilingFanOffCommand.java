package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {

    private final CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }
}
