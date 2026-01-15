package factory.simpleFactory.concretePizza;

import factory.simpleFactory.Pizza;

/**
 * @author Mikhail
 * <p>Пицца с мидиями.</p>
 */
public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
