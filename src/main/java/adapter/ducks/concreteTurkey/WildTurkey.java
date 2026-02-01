package adapter.ducks.concreteTurkey;

import adapter.ducks.Turkey;

/**
 * @author Mikhail
 * <p>Дикая утка.</p>
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
