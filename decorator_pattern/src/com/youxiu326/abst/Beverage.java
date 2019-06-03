package com.youxiu326.abst;

/**
 * 饮料抽象类
 */
public abstract class Beverage {

    public String description;

    /**
     * 饮料描述
     * @return
     */
    public abstract String getDescription();

    /**
     * 返回价钱
     */
    public abstract double cost();


} 