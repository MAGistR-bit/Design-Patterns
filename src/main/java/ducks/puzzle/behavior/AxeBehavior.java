package ducks.puzzle.behavior;

import ducks.puzzle.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I struck with an axe.");
    }
}
