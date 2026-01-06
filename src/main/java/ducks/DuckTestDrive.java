package ducks;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        mallardDuck.display();
        redheadDuck.display();
        rubberDuck.display();
    }
}
