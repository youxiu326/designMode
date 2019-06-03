package com.youxiu326.realize;

import com.youxiu326.inter.State;

/**
 * 售出糖果
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请稍等，正在发放糖果");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("不能退回25分钱，正在发放糖果");
    }

    @Override
    public void turnCrank() {
        System.out.println("不能转动曲柄，正在发放糖果");
    }

    /**
     * 发放糖果
     */
    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("糖果机没有糖果了");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}