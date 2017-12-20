package JavaObservable;

import JavaObservable.Observable.WeatherData;
import JavaObservable.Observer.CurrentConditionDisplay;
import JavaObservable.Observer.ForecastDisplay;
import JavaObservable.Observer.StatisticsDisplay;

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

        currentConditionDisplay.cancelRegister(weatherData);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
