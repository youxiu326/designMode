
###### 动态代理

参考博客:
[设计模式——代理模式（静态代理和JDK、CGLib动态代理）](https://www.cnblogs.com/zhengbin/p/6514045.html#4288104)



```
静态代理:
所谓静态就是在程序运行前就已经存在代理类的字节码文件，
代理类和委托类的关系在运行前就确定了

以上就是静态代理，下面分析其带来的优缺点：

优点：

　　客户端不必知道实现类（委托类）如何如何，只需要调用代理类即可。
缺点：
    代理类和委托类实现了相同的接口，代理类通过委托类实现了相同的方法。但这样出现了大量的代码重复。如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也要实现这个方法。这显然增加了代码的复杂度。
    代理对象只服务于一种类型的对象，如果要服务多类型的对象，那就要对每种对象都进行代理。静态代理子啊程序规模稍大是就无法胜任了。

```

___________________


```
JDK代理——接口级别代理
JDK 提供的 Proxy 类的工厂方法 newProxyInstance 去动态地创建一个 Hello 接口的代理类。
Proxy.newProxyInstance：
参数：

    loader - 定义代理类的类加载器
    interfaces - 代理类要实现的接口列表
    h - 指派方法调用的调用处理程序（每个代理实例都具有一个关联的调用处理程序，调用代理实例的方法时，将对方法的调用指派到它的调用处理程序的 invoke 方法）

返回：

一个带有代理类的指定调用处理程序的代理实例，它由指定类加载器定义，并实现指定的接口

```

___________________


```

CGLib代理——方法级别代理

```