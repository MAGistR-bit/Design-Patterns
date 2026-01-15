package factory.abstractFactory.stylePizzas.ny;

import factory.abstractFactory.Pizza;

/**
 * @author Mikhail
 * <p>Вегетарианская пицца, приготовленная в ньюйоркском стиле.</p>
 */
public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
