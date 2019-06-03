package com.youxiu326.command;

import com.youxiu326.inter.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
       //不做事情的命令 确定每隔插槽永远有命令对象
    }

    @Override
    public void undo() {

    }
}