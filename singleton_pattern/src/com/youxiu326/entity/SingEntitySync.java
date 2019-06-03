package com.youxiu326.entity;

/**
 * 同步方法
 */
public class SingEntitySync {

    private static SingEntitySync entity;

    private SingEntitySync(){}

    public synchronized static SingEntitySync getInstance(){
        if (entity==null){
            entity =new SingEntitySync();
        }
        return entity;
    }
} 