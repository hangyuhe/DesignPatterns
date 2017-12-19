package com.hhy.strategy.Behavior;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
