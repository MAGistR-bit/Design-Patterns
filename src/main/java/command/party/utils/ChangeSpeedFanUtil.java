package command.party.utils;

import command.party.receiver.CeilingFan;

public class ChangeSpeedFanUtil {

    public static void changeSpeed(int prevSpeed, CeilingFan ceilingFan) {
        switch (prevSpeed) {
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            default:
                ceilingFan.off();
                break;
        }
    }
}
