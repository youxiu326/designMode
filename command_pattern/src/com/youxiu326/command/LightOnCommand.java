package com.youxiu326.command;

import com.youxiu326.inter.Command;
import com.youxiu326.realize.Light;

/**
 * 打开灯泡的命令
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}