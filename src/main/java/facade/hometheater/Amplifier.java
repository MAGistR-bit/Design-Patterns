package facade.hometheater;

/**
 * @author Mikhail
 * <p>Усилитель</p>
 */
public class Amplifier {

    private final String description;
    private StreamingPlayer player;
    private Tuner tuner;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is on.");
    }

    public void off() {
        System.out.println(description + " is off.");
    }

    public void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer).");
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }

    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        System.out.println(description + " setting streaming player to " + streamingPlayer);
        this.player = streamingPlayer;
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + tuner);
        this.tuner = tuner;
    }

    @Override
    public String toString() {
        return description;
    }
}
