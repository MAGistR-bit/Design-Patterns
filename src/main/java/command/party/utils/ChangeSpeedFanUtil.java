package command.party.utils;

import command.party.receiver.CeilingFan;

public class ChangeSpeedFanUtil {

    /**
     * Изменяет скорость вращения вентилятора.
     * @param speed скорость вращения
     * @param ceilingFan вентилятор, для которого необходимо отрегулировать скорость вращения
     */
    public static void changeSpeed(int speed, CeilingFan ceilingFan) {
        switch (speed) {
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
