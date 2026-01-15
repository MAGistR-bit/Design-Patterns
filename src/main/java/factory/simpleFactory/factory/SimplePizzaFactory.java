package factory.simpleFactory.factory;

import factory.simpleFactory.Pizza;
import factory.simpleFactory.concretePizza.CheesePizza;
import factory.simpleFactory.concretePizza.ClamPizza;
import factory.simpleFactory.concretePizza.PepperoniPizza;
import factory.simpleFactory.concretePizza.VeggiePizza;

/**
 * @author Mikhail
 * <p>Фабрика, которая занимается исключительно
 * созданием пиццы для своих клиентов.</p>
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> throw new IllegalArgumentException("Invalid pizza type");
        };
    }
}
