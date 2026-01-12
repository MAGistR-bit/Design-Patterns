package starbuzz.decorator.condiments;

import starbuzz.decorator.beverage.Beverage;

/**
 * @author Mikhail
 * <p>Клиент может попросить взбить (whipped) кофе.</p>
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
