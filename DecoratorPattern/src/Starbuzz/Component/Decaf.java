package Starbuzz.Component;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public class Decaf extends Beverage {
    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
