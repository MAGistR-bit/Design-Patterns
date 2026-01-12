package starbuzz.decorator.condiments;

import starbuzz.decorator.beverage.Beverage;

/**
 * @author Mikhail
 * <p>Клиент может попросить добавить в кофе молоко.</p>
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
