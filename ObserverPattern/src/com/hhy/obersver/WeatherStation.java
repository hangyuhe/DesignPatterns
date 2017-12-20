package com.hhy.obersver;

import com.hhy.obersver.Observer.CurrentConditionDisplay;
import com.hhy.obersver.Observer.ForecastDisplay;
import com.hhy.obersver.Observer.StatisticsDisplay;
import com.hhy.obersver.Subject.WeatherData;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
