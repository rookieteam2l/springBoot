package com.sunshine.free.headfirst.observer;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public interface Subject {

    /**
     * 注册
     */
    public void registerObserver(Observer o);

    /**
     * 删除
     */
    public void removeObserver(Observer o);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有观察者
     */
    public void notifyObserver();
}
