package command.party.receiver;

public class Light {

    private String location;
    private int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        level = 100;
        System.out.println(location + " light is on");
    }

    public void off() {
        level = 0;
        System.out.println(location + " light is off");
    }

    public void dim(int newLevel) {
        this.level = newLevel;
        if (newLevel == 0) {
            off();
        } else {
            System.out.println("Light is dimmed to " + newLevel + "%");
        }
    }

    public int getLevel() {
        return level;
    }
}
