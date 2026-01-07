package ducks.behavior.quack;

/**
 * @author Mikhail
 * <p>Реализация поведения для уток, которые умеют крякать.</p>
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
