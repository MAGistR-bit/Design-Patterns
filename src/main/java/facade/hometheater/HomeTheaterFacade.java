package facade.hometheater;

/**
 * @author Mikhail
 * <p>Фасадный интерфейс для домашнего кинотеатра.</p>
 */
public class HomeTheaterFacade {

    private final Amplifier amplifier;
    private final Tuner tuner;
    private final StreamingPlayer player;
    private final Projector projector;
    private final Screen screen;
    private final TheaterLights lights;
    private final PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             StreamingPlayer player,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get already to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(player);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        player.on();
        player.play(movie);
    }

    void endMovie() {
        System.out.println("End movie");
    }

    void listenToRadio() {
        System.out.println("Listen to radio");
    }

    void endRadio() {
        System.out.println("End radio");
    }
}
