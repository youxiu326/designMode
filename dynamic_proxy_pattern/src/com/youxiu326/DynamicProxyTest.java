package com.youxiu326;

import com.youxiu326.inter.Hello;
import com.youxiu326.inter.impl.HelloImpl;
import com.youxiu326.proxy.CGLibProxy;
import com.youxiu326.proxy.DynamicProxy;
import com.youxiu326.proxy.HelloProxy;

public class DynamicProxyTest {

    static class Test01{
        public static void main(String[] args) {
            Hello proxy = new HelloProxy();
            proxy.sayHello("normal");
        }
    }

    static class Test02{
        public static void main(String[] args) {
            DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl());
            Hello hello = dynamicProxy.getProxy();
            hello.sayHello("JDK");
            System.out.println("end ...");
        }
    }

    static class Test03{
        public static void main(String[] args) {
            Hello helloCGLib = CGLibProxy.getInstance().getProxy(HelloImpl.class);
            helloCGLib.sayHello("CGLib");
        }
    }

} 