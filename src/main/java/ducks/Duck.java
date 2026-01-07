package ducks;

import ducks.behavior.fly.FlyBehavior;
import ducks.behavior.quack.QuackBehavior;

/**
 * @author Mikhail
 * <p>Абстрактный класс Duck.</p>
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
