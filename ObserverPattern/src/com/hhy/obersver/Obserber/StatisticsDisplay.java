package com.hhy.obersver.Obserber;

import com.hhy.obersver.DisplayElement;
import com.hhy.obersver.Obserber.Observer;
import com.hhy.obersver.Subject.WeatherData;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if(temp > maxTemp){
            maxTemp = temp;
        }

        if(temp < minTemp){
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
