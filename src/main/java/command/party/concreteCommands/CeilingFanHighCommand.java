package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.CeilingFan;

import static command.party.utils.ChangeSpeedFanUtil.changeSpeed;

public class CeilingFanHighCommand implements Command {

    private final CeilingFan ceilingFan;

    /**
     * Предыдущая скорость вентилятора.
     */
    private int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        changeSpeed(prevSpeed, ceilingFan);
    }
}
