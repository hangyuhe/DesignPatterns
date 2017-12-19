package com.hhy.strategy.Behavior;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!!");
    }
}
