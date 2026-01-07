package ducks.behavior.quack;

/**
 * @author Mikhail
 * <p>Реализация поведения для уток, которые молчат.</p>
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<< Silence >>>");
    }
}
