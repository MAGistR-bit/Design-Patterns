package command.party.concreteCommands;

import command.party.Command;
import command.party.receiver.Stereo;

/**
 * @author Mikhail
 * <p>Команда для воспроизведения диска в стереосистеме.</p>
 */
public class StereoOnWithCDCommand implements Command {

    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
