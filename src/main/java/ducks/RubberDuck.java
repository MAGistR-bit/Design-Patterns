package ducks;

import ducks.behavior.fly.FlyNoWay;
import ducks.behavior.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber duck!");
    }
}
