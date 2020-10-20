package com.sunshine.free.headfirst.observerjava;

import java.util.Observable;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description: java内置观察者模式
 * @Modified By:
 * @Version:
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){

    }



    /**
     * 当气象站得到更新观测值时，通知观测者
     */
    public void measurementsChanged(){

        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
