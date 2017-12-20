package JavaObservable.Observer;

import JavaObservable.Observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void cancelRegister(Observable observable){
        observable.deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
