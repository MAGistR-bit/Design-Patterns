package ducks;

import ducks.behavior.fly.FlyBehavior;
import ducks.behavior.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;



    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract void display();
}
