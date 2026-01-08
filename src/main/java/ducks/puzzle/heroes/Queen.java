package ducks.puzzle.heroes;

import ducks.puzzle.Character;
import ducks.puzzle.behavior.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    protected void fight() {
        System.out.println("The Queen is fighting the villains.");
    }
}
