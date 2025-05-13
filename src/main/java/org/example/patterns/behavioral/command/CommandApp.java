package org.example.patterns.behavioral.command;

public class CommandApp {

    public static void main(String[] args) {
        Light light = new Light();
        Command turnOnLightCommand = new TurnOnLightCommand(light);
        Command turnOffCommand = new TurnOffLightCommand(light);

        // Turn the light ON
        RemoteControl remote = new RemoteControl();
        remote.setCommand(turnOnLightCommand);
        remote.pressButton();

        // Turn the light Off
        remote.setCommand(turnOffCommand);
        remote.pressButton();
    }
}
