package Strategy.Behavior;

/**
 * Created by hhyx5 on 2017/12/19.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
