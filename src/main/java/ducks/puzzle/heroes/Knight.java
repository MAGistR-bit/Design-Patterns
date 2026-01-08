package ducks.puzzle.heroes;

import ducks.puzzle.Character;
import ducks.puzzle.behavior.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    protected void fight() {
        System.out.println("The Knight tries to repel the attack.");
    }
}
