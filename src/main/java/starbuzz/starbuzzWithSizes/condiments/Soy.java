package starbuzz.starbuzzWithSizes.condiments;

import starbuzz.starbuzzWithSizes.Beverage;
import starbuzz.starbuzzWithSizes.CoffeeSize;
import starbuzz.starbuzzWithSizes.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    /**
     * Вычисляет стоимость сои.
     * <p>Стоимость дополнения зависит от размеров порции кофе.</p>
     *
     * @return стоимость сои с учетом размера порции.
     */
    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == CoffeeSize.TALL) {
            cost += .10;
        } else if (beverage.getSize() == CoffeeSize.GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == CoffeeSize.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
