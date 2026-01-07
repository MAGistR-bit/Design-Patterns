package ducks.behavior.fly;

/**
 * @author Mikhail
 * <p>Реализация поведения для уток, которые не летают (например, резиновые).</p>
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
