package command.party;

import command.party.concreteCommands.LightOffCommand;
import command.party.concreteCommands.LightOnCommand;
import command.party.concreteCommands.StereoOnWithCDCommand;
import command.party.receiver.Light;
import command.party.receiver.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(light);
        LightOffCommand livingRoomLightOff = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }
}
