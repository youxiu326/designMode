package com.youxiu326.realize;

import com.youxiu326.inter.Observer;
import com.youxiu326.inter.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;

    private float temp;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeOberver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyOberver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyOberver();
    }
}