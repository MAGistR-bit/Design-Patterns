package command;

import command.simpleremote.commands.GarageDoorCommand;
import command.simpleremote.commands.LightOnCommand;
import command.simpleremote.invoker.SimpleRemoteControl;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();

        Command garageOpen = new GarageDoorCommand(garageDoor);
        Command lightOn = new LightOnCommand(light);

        remoteControl.setCommand(garageOpen);
        remoteControl.buttonWasPressed();

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
    }
}
