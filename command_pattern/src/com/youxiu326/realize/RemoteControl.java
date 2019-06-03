package com.youxiu326.realize;

import com.youxiu326.inter.Command;
import com.youxiu326.command.NoCommand;

import java.util.Arrays;

/**
 * 遥控器
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {

        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = new NoCommand();
    }

    /**
     *
     * @param slot 插槽的位置
     * @param onCommand 开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 开
     * @param slot 插槽的位置
     */
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    /**
     * 关
     * @param slot 插槽的位置
     */
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}