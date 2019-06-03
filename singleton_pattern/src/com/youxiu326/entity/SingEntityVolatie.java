package com.youxiu326.entity;

/**
 * 双重检查加锁
 */
public class SingEntityVolatie {

    private volatile static SingEntityVolatie entity;

    private SingEntityVolatie(){}

    public static SingEntityVolatie getInstance(){
        if (entity==null){
            synchronized (SingEntityVolatie.class){
                if (entity==null){
                    entity = new SingEntityVolatie();
                }
            }
        }
        return entity;
    }

} 