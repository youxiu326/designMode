package com.youxiu326.inter;

/**
 * 针对接口编程
 */
public interface Pizza {

    /**
     * 准备
     */
    public void prepare();

    /**
     * 烘烤
     */
    public void bake();

    /**
     * 切片
     */
    public  void cut();

    /**
     * 装盒
     */
    public abstract void box();

} 