package ducks.behavior.quack;

/**
 * @author Mikhail
 * <p>Реализация поведения для уток, которые умеют пищать.</p>
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
