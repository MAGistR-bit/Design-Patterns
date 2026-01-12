package starbuzz.decorator.condiments;

import starbuzz.decorator.beverage.Beverage;

/**
 * @author Mikhail
 * <p>Клиент может попросить сделать кофе с горячим шоколадом.</p>
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
