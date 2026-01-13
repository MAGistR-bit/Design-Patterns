package starbuzz.decorator.condiments;

import starbuzz.decorator.beverage.Beverage;

/**
 * @author Mikhail
 * <p>Абстрактный класс для дополнений.</p>
 * Объекты должны быть взаимозаменяемы с Beverage, поэтому используется наследование.
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;
    public abstract String getDescription();
}
