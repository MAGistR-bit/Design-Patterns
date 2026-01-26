package command.party.receiver;

/**
 * @author Mikhail
 * <p>Потолочный вентилятор.</p>
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;

    /**
     * Скорость вращения вентилятора.
     */
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        // turns the ceiling fan on to high
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high.");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium.");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " ceiling fan is on low.");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " ceiling fan is on off.");
    }

    /**
     * Получение текущей скорости вентилятора.
     * @return скорость вентилятора
     */
    public int getSpeed() {
        return speed;
    }
}
