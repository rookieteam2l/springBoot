package com.sunshine.free.headfirst.observer;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public interface Observer {

    /**
     * 当气象测试值改变时，主题会把这些状态值当作方法的参数，传送给观察者 所有的观察者必须实现update方法
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}
