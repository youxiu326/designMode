package com.youxiu326.realize;

import com.youxiu326.inter.State;

/**
 * 有25分钱
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你不需要再次投入25分钱了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退回25分钱");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("转动曲柄");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("现在还不能发放糖果");
    }
}