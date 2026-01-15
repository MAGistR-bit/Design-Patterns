package factory.simpleFactory.concretePizza;

import factory.simpleFactory.Pizza;

/**
 * @author Mikhail
 * <p>Вегетарианская пицца.</p>
 */
public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara Sauce";
        toppings.add("Shredded Mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
