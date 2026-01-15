package factory.abstractFactory.stylePizzas.ny;

import factory.abstractFactory.Pizza;

/**
 * @author Mikhail
 * <p>Пицца с сыром, приготовленная ньюйорксом стиле.</p>
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
