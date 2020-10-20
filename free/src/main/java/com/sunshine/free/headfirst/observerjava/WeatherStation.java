package com.sunshine.free.headfirst.observerjava;

import com.sunshine.free.headfirst.observer.CurrentConditionsDisplay;
import com.sunshine.free.headfirst.observer.StatisticsDisplay;
import com.sunshine.free.headfirst.observer.WeatherData;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,62,32.4f);
        weatherData.setMeasurements(83,64,33.4f);

    }
}
