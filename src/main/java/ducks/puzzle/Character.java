package ducks.puzzle;

/**
 * @author Mikhail
 * <p>Игровой персонаж.</p>
 */
public abstract class Character {

    /**
     * Класс СОДЕРЖИТ поведение для выбора оружия.
     */
    protected WeaponBehavior weaponBehavior;

    protected abstract void fight();

    public void performWeapon() {
        weaponBehavior.useWeapon();
    }

    /**
     * Динамическое изменение оружия для героя приключенческой игры.
     * @param weaponBehavior действие с оружием.
     */
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
