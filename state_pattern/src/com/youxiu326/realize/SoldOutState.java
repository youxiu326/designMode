package com.youxiu326.realize;

import com.youxiu326.inter.State;

/**
 * 糖果售罄了
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("糖果售罄了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果售罄了");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果售罄了");
    }

    @Override
    public void dispense() {
        System.out.println("糖果售罄了");
    }
}