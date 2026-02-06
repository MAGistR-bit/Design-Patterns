package facade.hometheater;

public class StreamingPlayer {
    public void on() {
        System.out.println("StreamingPlayer on.");
    }

    public void play(String movie) {
        System.out.println("StreamingPlayer playing " + movie);
    }
}
