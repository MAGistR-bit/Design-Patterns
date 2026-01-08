package ducks.puzzle.behavior;

import ducks.puzzle.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("He used a sword.");
    }
}
