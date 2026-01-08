package ducks.puzzle.behavior;

import ducks.puzzle.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("He stabbed me.");
    }
}
