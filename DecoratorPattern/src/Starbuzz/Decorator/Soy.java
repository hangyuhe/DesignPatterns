package Starbuzz.Decorator;

import Starbuzz.Component.Beverage;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
