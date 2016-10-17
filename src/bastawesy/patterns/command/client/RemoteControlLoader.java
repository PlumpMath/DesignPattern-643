package bastawesy.patterns.command.client;

import bastawesy.patterns.command.commandobject.Command;
import bastawesy.patterns.command.commandobject.impl.*;
import bastawesy.patterns.command.invoker.RemoteControl;
import bastawesy.patterns.command.receiver.CeilingFan;
import bastawesy.patterns.command.receiver.GarageDoor;
import bastawesy.patterns.command.receiver.Light;
import bastawesy.patterns.command.receiver.Stereo;

/**
 * Created by ahmed.bastawesy on 10/16/2016.
 */
public class RemoteControlLoader {

    public void load() {
        RemoteControl remoteControl = new RemoteControl();

        /** create all receivers */
        Light livingRoomLight = new Light(" Living Room light");
        Light kitchenLight = new Light(" Kitchen light");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("living room");


        /** create the command objects */

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);


        /** create the macro command*/
        Command[] partyOn = {livingRoomLightOn, kitchenRoomLightOn, garageDoorUpCommand};
        Command[] partyOff = {livingRoomLightOff, kitchenRoomLightOff, garageDoorDownCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);


        /** lood all command objects into remote slots*/

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.setCommand(4, stereoOnWithCdCommand, stereoOffCommand);
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);


        System.out.println(remoteControl);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.unDoButtonWasPressed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.unDoButtonWasPressed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.unDoButtonWasPressed();

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

        System.out.println(" \n  Testing macro on  \n");
        remoteControl.onButtonWasPushed(5);

        System.out.println(" \n  Un do macro on  \n");
        remoteControl.unDoButtonWasPressed();

        System.out.println(" \n  Testing macro off  \n");
        remoteControl.offButtonWasPushed(5);

    }
}
