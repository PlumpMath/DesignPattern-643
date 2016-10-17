package bastawesy.patterns.command.commandobject.impl;

import bastawesy.patterns.command.commandobject.Command;
import bastawesy.patterns.command.receiver.Stereo;

/**
 * Created by ahmed.bastawesy on 10/16/2016.
 */
public class StereoOnWithCdCommand implements Command {

    Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void unDo() {
        stereo.off();
    }
}
