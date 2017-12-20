package Strategy.Entity;

import Strategy.Behavior.FlyWithWings;
import Strategy.Behavior.Quack;

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
