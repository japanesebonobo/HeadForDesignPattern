package chapter6.Remote;

public class RemoteLoader {
    
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();
        // Light kitchenLight = new Light("Kitchen");
        CeilingFan ceiligFan = new CeilingFan("Living Room");
        // GarageDoor garageDoor = new GarageDoor("Garage");
        

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);
        
        // LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        // LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanMidiumCommand ceiligFanMedium = new CeilingFanMidiumCommand(ceiligFan);
        CeilingFanHighCommand ceiligFanHigh = new CeilingFanHighCommand(ceiligFan);
        // CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceiligFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceiligFan);

        // GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        // GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        // StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        // remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        // remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        // remoteControl.setCommand(0, ceiligFanMedium, ceilingFanOff);
        // remoteControl.setCommand(1, ceiligFanHigh, ceilingFanOff);
        // remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);

        Command[] partyOn = { livingRoomLightOn, stereoOnWithCD, tvOn, hottubOn };
        Command[] partyOff = { livingRoomLightOff, stereoOffWithCD, tvOff, hottubOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // System.out.println(remoteControl);

        // remoteControl.onButtonWasPushed(0);
        // remoteControl.offButtonWasPushed(0);
        // System.out.println(remoteControl);
        // remoteControl.undoButtonWasPushed();
        // remoteControl.offButtonWasPushed(1);
        // remoteControl.onButtonWasPushed(1);
        // System.out.println(remoteControl);
        // remoteControl.undoButtonWasPushed();

        // remoteControl.onButtonWasPushed(1);
        // remoteControl.offButtonWasPushed(1);
        // remoteControl.onButtonWasPushed(2);
        // remoteControl.offButtonWasPushed(2);
        // remoteControl.onButtonWasPushed(3);
        // remoteControl.offButtonWasPushed(3);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
    }
}
