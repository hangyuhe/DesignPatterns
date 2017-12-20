package Starbuzz;

import Starbuzz.Component.Beverage;
import Starbuzz.Component.DarkRoast;
import Starbuzz.Component.Espresso;
import Starbuzz.Component.HouseBlend;
import Starbuzz.Decorator.Mocha;
import Starbuzz.Decorator.Soy;
import Starbuzz.Decorator.Whip;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
