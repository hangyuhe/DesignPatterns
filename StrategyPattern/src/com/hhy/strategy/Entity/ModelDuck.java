package com.hhy.strategy.Entity;

import com.hhy.strategy.Behavior.FlyNoWay;
import com.hhy.strategy.Behavior.Quack;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public class ModelDuck extends Duck {
    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model Duck!");
    }
}
