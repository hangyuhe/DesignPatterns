package Starbuzz.Component;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public abstract class Beverage {
    String description = "Unknown Starbuzz.Component.Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
