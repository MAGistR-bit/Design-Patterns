package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.CeilingFan;

import static command.party.utils.ChangeSpeedFanUtil.changeSpeed;

public class CeilingFanMediumCommand implements Command {

    private final CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        changeSpeed(prevSpeed, ceilingFan);
    }

}
