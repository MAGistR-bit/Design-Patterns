package factory.abstractFactory.pizzaStores;

import factory.abstractFactory.Pizza;
import factory.abstractFactory.PizzaStore;

/**
 * @author Mikhail
 * <p>Магазин по продаже пиццы в Калифорнии.</p>
 */
public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return null;
    }
}
