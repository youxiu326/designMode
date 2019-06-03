package com.youxiu326;

import com.youxiu326.command.LightOnCommand;
import com.youxiu326.realize.Light;
import com.youxiu326.realize.SimpleRemoteControl;

public class RemoteControlTest {

    public static void main(String[] args) {

        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

    }

} 