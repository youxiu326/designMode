package com.youxiu326.realize;

import com.youxiu326.inter.DisplayElement;
import com.youxiu326.inter.Observer;
import com.youxiu326.inter.Subject;

public class TempDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    public TempDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this::update);
    }

    @Override
    public void display() {
        System.out.println(temperature+"-"+humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}