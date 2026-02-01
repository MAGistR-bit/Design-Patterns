package adapter.ducks;

import java.util.Random;

public class DuckAdapter implements Turkey {

    private final Duck duck;
    private final Random random = new Random();

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
