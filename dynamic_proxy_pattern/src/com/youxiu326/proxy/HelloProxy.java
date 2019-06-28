package com.youxiu326.proxy;

import com.youxiu326.inter.Hello;
import com.youxiu326.inter.impl.HelloImpl;

/**
 * 实现一个代理类
 */
public class HelloProxy implements Hello {
    private Hello hello;
    public HelloProxy() {
        hello = new HelloImpl();
    }
    private void sayBefore() { System.out.println("Before.."); }
    private void sayAfter() { System.out.println("After.."); }
    public void sayHello(String way) {
        sayBefore();
        hello.sayHello(way);
        sayAfter();
    }
}