package factory.factoryMethod.stylePizzas.argentina;

import factory.factoryMethod.Pizza;

public class ArgentinianStyleCheesePizza extends Pizza {

    public ArgentinianStyleCheesePizza() {
        name = "Argentinian Style Cheese Pizza";
        dough = "Crust";
        sauce = "Tomato Sauce";

        toppings.add("Green Olives");
        toppings.add("Mozzarella");
    }
}
