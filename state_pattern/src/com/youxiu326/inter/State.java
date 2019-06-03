package com.youxiu326.inter;

public interface State {

    /**
     *  投入25分钱
      */
    public void insertQuarter();

    /**
     * 退回25分钱
     */
    public void ejectQuarter();

    /**
     * 转动曲柄
     */
    public void turnCrank();

    /**
     * 售出糖果
     */
    public void dispense();

} 