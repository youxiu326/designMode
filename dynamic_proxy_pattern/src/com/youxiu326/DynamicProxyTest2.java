package com.youxiu326;

import com.youxiu326.inter.Hello;
import com.youxiu326.inter.impl.HelloImpl;
import com.youxiu326.proxy.DynamicProxy;
import com.youxiu326.proxy.HelloProxy;

public class DynamicProxyTest2 {


    public static void main(String[] args) {

        DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl());
        Hello hello = dynamicProxy.getProxy();
        hello.sayHello("JDK");
        System.out.println("end ...");

    }


} 