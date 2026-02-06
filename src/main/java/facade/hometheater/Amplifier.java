package facade.hometheater;

/**
 * @author Mikhail
 * <p>Усилитель</p>
 */
public class Amplifier {

    private StreamingPlayer player;

    public void on() {
        System.out.println("Amplifier on.");
    }

    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        this.player = streamingPlayer;
        System.out.println("Setting streaming player to " + streamingPlayer);
    }

    public void setSurroundSound() {
        System.out.println("Setting surround sound to " + player);
    }

    public void setVolume(int i) {
        System.out.println("Setting volume to " + i);
    }
}
