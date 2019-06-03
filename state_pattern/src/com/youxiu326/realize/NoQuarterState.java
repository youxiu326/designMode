package com.youxiu326.realize;

import com.youxiu326.inter.State;

/**
 * 没有25分钱
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入25分钱");
        gumballMachine.setState(gumballMachine.getHasQuarterState());

    }

    @Override
    public void ejectQuarter() {
        System.out.println("没有钱可以退");
    }

    @Override
    public void turnCrank() {
        System.out.println("不能转动曲柄");
    }

    @Override
    public void dispense() {
        System.out.println("请先投入25分钱");
    }
}