package com.youxiu326.inter;

/**
 *  主题接口
 */
public interface Subject {

    /**
     * 添加观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    public void removeOberver(Observer observer);

    /**
     * 通知方法
     */
    public void notifyOberver();

}
