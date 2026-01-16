package factory.factoryMethod.pizzaStores;

import factory.factoryMethod.Pizza;
import factory.factoryMethod.PizzaStore;
import factory.factoryMethod.stylePizzas.ny.NYStyleCheesePizza;
import factory.factoryMethod.stylePizzas.ny.NYStyleClamPizza;
import factory.factoryMethod.stylePizzas.ny.NYStyleVeggiePizza;

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
