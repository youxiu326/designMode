package com.youxiu326.inter;

/**
 * 命令接口
 *
 * 定义了一个执行方法
 */
public interface Command {

    public void execute();

    public void undo();

} 