package com.youxiu326;

import com.youxiu326.inter.Observer;
import com.youxiu326.inter.Subject;
import com.youxiu326.realize.WeatherData;
import com.youxiu326.realize.TempDisplay;

public class WeatherStation{

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        TempDisplay t = new TempDisplay(weatherData);
        weatherData.setMeasurements(60f, 45f, 77f);

    }
}