package command.party;

import command.party.concreteCommands.CeilingFanHighCommand;
import command.party.concreteCommands.CeilingFanOffCommand;
import command.party.concreteCommands.LightOffCommand;
import command.party.concreteCommands.LightOnCommand;
import command.party.concreteCommands.MacroCommand;
import command.party.concreteCommands.StereoOffCommand;
import command.party.concreteCommands.StereoOnWithCDCommand;
import command.party.concreteCommands.TVOffCommand;
import command.party.concreteCommands.TVOnCommand;
import command.party.invoker.RemoteControl;
import command.party.receiver.CeilingFan;
import command.party.receiver.Light;
import command.party.receiver.Stereo;
import command.party.receiver.TV;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(3, ceilingFanOn, ceilingFanOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

        // Macro Command
        Command[] partyOn = {livingRoomLightOn, stereoOnWithCD, tvOn};
        Command[] partyOff = {livingRoomLightOff, stereoOff, tvOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(4, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(4);
        System.out.println("\n--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(4);
    }
}
