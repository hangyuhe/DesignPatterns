package Strategy.Entity;

import Strategy.Behavior.FlyBehavior;
import Strategy.Behavior.QuackBehavior;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void perfomFly(){
        flyBehavior.fly();
    }

    public void perfomQuack(){
        quackBehavior.quack();
    }

    public void  swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
