package com.youxiu326.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {

    // 单例模式
    private static CGLibProxy instance = new CGLibProxy();
    private CGLibProxy() {}
    public static CGLibProxy getInstance () { return instance; }
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        sayBefore();
        Object result = methodProxy.invokeSuper(obj, objects);
        sayAfter();
        return result;
    }
    private void sayBefore() { System.out.println("before..."); }
    private void sayAfter() { System.out.println("after..."); }
}