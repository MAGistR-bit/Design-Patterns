package ducks.behavior.fly;

/**
 * @author Mikhail
 * <p>Реализация поведения для уток, которые умеют летать.</p>
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
