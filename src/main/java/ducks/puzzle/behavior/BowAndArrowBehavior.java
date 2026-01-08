package ducks.puzzle.behavior;

import ducks.puzzle.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("An arrow shot from a bow.");
    }
}
