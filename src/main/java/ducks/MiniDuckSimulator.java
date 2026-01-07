package ducks;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        mallardDuck.display();
        redheadDuck.display();
        rubberDuck.display();
    }
}
