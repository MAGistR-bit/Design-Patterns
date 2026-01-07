package ducks.behavior.fly;

/**
 * @author Mikhail
 * <p>Реактивный полет.</p>
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
