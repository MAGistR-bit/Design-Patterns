package ducks.puzzle.heroes;

import ducks.puzzle.Character;
import ducks.puzzle.behavior.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    protected void fight() {
        System.out.println("The Troll is trying to take over the kingdom.");
    }
}
