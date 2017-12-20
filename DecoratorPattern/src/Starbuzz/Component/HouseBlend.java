package Starbuzz.Component;

/**
 * Created by hhyx5 on 2017/12/20.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
