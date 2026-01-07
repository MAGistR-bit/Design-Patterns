package ducks;

import ducks.behavior.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        redheadDuck.display();
        rubberDuck.display();
    }
}
