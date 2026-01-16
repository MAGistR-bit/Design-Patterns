package factory.factoryMethod.pizzaStores;

import factory.factoryMethod.Pizza;
import factory.factoryMethod.PizzaStore;
import factory.factoryMethod.stylePizzas.chicago.ChicagoStyleCheesePizza;
import factory.factoryMethod.stylePizzas.chicago.ChicagoStyleClamPizza;
import factory.factoryMethod.stylePizzas.chicago.ChicagoStylePepperoniPizza;
import factory.factoryMethod.stylePizzas.chicago.ChicagoStyleVeggiePizza;

/**
 * @author Mikhail
 * <p>Магазин по продаже пиццы в Чикаго.</p>
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> throw new IllegalArgumentException("Invalid pizza type");
        };
    }
}
