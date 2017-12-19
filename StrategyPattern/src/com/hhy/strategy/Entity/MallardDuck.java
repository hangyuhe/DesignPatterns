package com.hhy.strategy.Entity;

import com.hhy.strategy.Behavior.FlyWithWings;
import com.hhy.strategy.Behavior.Quack;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display(){
        System.out.println("I'm a real Mallard Duck!");
    }
}
