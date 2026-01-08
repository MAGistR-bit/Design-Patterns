package ducks.puzzle;

import ducks.puzzle.behavior.BowAndArrowBehavior;
import ducks.puzzle.heroes.King;
import ducks.puzzle.heroes.Knight;
import ducks.puzzle.heroes.Queen;
import ducks.puzzle.heroes.Troll;

public class AdventureGameSimulator {

    public static void main(String[] args) {
        Character troll = new Troll();
        Character queen = new Queen();
        Character king = new King();
        Character knight = new Knight();

        queen.fight();
        king.fight();
        knight.fight();

        troll.performWeapon();
        troll.setWeaponBehavior(new BowAndArrowBehavior());
        troll.performWeapon();
    }
}
