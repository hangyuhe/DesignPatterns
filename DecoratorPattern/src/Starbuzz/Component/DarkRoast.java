package Starbuzz.Component;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
