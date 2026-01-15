package factory.abstractFactory.stylePizzas.ny;

import factory.abstractFactory.Pizza;

/**
 * @author Mikhail
 * <p>Пицца с мидиями, приготовленная в ньюйоркском стиле.</p>
 */
public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
