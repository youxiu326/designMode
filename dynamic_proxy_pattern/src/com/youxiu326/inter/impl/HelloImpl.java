package com.youxiu326.inter.impl;

import com.youxiu326.inter.Hello;

public class HelloImpl implements Hello {
    public void sayHello(String way) {
        System.out.println("Hello by " + way);
    }
}