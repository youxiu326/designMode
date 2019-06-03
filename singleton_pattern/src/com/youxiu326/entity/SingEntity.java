package com.youxiu326.entity;

public class SingEntity {

    private static SingEntity entity = new SingEntity();

    private SingEntity(){}

    public static SingEntity getInstance(){
        return entity;
    }

} 