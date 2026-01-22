package command.simpleremote;

import command.simpleremote.commands.GarageDoorCommand;
import command.simpleremote.commands.LightOnCommand;
import command.simpleremote.invoker.SimpleRemoteControl;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // Получатели запроса
        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();

        Command garageOpen = new GarageDoorCommand(garageDoor);
        Command lightOn = new LightOnCommand(light);

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
