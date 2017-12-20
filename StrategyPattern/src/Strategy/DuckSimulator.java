package Strategy;

import Strategy.Behavior.FlyRocketPowered;
import Strategy.Entity.Duck;
import Strategy.Entity.MallardDuck;
import Strategy.Entity.ModelDuck;

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
