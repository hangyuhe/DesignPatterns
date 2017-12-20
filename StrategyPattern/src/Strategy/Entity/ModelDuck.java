package Strategy.Entity;

import Strategy.Behavior.Quack;
import Strategy.Behavior.FlyNoWay;

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
