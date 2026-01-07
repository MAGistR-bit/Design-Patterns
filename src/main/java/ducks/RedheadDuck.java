package ducks;

import ducks.behavior.fly.FlyWithWings;
import ducks.behavior.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck.");
    }
}
