package com.youxiu326.realize;

import com.youxiu326.inter.Command;

/**
 * 遥控器
 */
public class SimpleRemoteControl {

    private Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 按下按钮方法
     */
    public void buttonWasPressed(){
        command.execute();
    }
}