package com.youxiu326.command;

import com.youxiu326.inter.Command;
import com.youxiu326.realize.Light;

/**
 * 打开灯泡的命令
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}