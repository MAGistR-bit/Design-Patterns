package factory.factoryMethod.pizzaStores;

import factory.factoryMethod.Pizza;
import factory.factoryMethod.PizzaStore;

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
