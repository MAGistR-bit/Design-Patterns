package factory.factoryMethod.stylePizzas.ny;

import factory.factoryMethod.Pizza;

/**
 * @author Mikhail
 * <p>Пицца с сыром, приготовленная в региональном (нью-йоркском) стиле.</p>
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
