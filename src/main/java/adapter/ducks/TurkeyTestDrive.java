package adapter.ducks;

import adapter.ducks.concreteDuck.MallardDuck;
import adapter.ducks.concreteTurkey.WildTurkey;

public class TestDriveAdapter {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        Turkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(mallardDuck);

        // Выдаем Turkey за Duck
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    /**
     * Метод для тестирования механизма работы с утками и адаптером.
     * @param duck утка
     */
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
