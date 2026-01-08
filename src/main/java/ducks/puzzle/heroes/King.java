package ducks.puzzle.heroes;

import ducks.puzzle.Character;
import ducks.puzzle.behavior.BowAndArrowBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    protected void fight() {
        System.out.println("The King is fighting the villains.");
    }
}
