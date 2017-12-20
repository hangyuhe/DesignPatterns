package Starbuzz.Decorator;

import Starbuzz.Component.Beverage;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
