package com.hhy.obersver.Obserber;

import com.hhy.obersver.DisplayElement;
import com.hhy.obersver.Obserber.Observer;
import com.hhy.obersver.Subject.Subject;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
