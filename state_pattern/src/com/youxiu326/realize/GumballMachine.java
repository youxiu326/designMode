package com.youxiu326.realize;

import com.youxiu326.inter.State;

/**
 * 糖果机类
 */
public class GumballMachine {

    private State soldOutState;

    private State noQuarterState;

    private State hasQuarterState;

    private State soldState;

    private State state = soldOutState;

    private int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count>0){
            state = noQuarterState;
        }
    }

    /**
     *  投入25分钱
     */
    public void insertQuarter(){
        state.insertQuarter();
    }

    /**
     * 退回25分钱
     */
    public void ejectQuarter(){
        state.ejectQuarter();
    }

    /**
     * 转动曲柄
     */
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }


    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    /**
     * 释放糖果
     */
    public void releaseBall(){
        System.out.println("一颗糖果落下来了");
        if (count!=0){
            count = count-1;
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}