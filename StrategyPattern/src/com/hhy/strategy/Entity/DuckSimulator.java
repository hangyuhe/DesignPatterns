package com.hhy.strategy.Entity;

import com.hhy.strategy.Behavior.FlyRocketPowered;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public class DuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.perfomFly();
        mallard.perfomQuack();

        Duck model = new ModelDuck();
        model.perfomFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perfomFly();
    }
}
