package factory.abstractFactory.pizzaStores;

import factory.abstractFactory.Pizza;
import factory.abstractFactory.PizzaStore;
import factory.abstractFactory.stylePizzas.ny.NYStyleCheesePizza;
import factory.abstractFactory.stylePizzas.ny.NYStyleClamPizza;
import factory.abstractFactory.stylePizzas.ny.NYStyleVeggiePizza;

/**
 * @author Mikhail
 * <p>Магазин по продаже пиццы в Нью-Йорке.</p>
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "clam" -> new NYStyleClamPizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> throw new IllegalArgumentException("Invalid pizza type");
        };
    }
}
