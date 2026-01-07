package ducks;

import ducks.behavior.fly.FlyNoWay;
import ducks.behavior.quack.Quack;

/**
 * @author Mikhail
 * <p>Утка-приманка</p>
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
