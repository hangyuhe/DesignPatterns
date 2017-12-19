package com.hhy.strategy.Behavior;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
