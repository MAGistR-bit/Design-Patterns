package factory.factoryMethod.pizzaStores;

import factory.factoryMethod.Pizza;
import factory.factoryMethod.PizzaStore;
import factory.factoryMethod.stylePizzas.argentina.ArgentinianFugazzettaPizza;
import factory.factoryMethod.stylePizzas.argentina.ArgentinianStyleCheesePizza;

/**
 * @author Mikhail
 * <p>Магазин по продаже пиццы в Калифорнии.</p>
 */
public class ArgentinianPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ArgentinianStyleCheesePizza();
            case "fugazzetta" -> new ArgentinianFugazzettaPizza();
            default -> throw new IllegalArgumentException("Invalid pizza type");
        };
    }
}
