package factory.factoryMethod.stylePizzas.argentina;

import factory.factoryMethod.Pizza;

public class ArgentinianFugazzettaPizza extends Pizza {

    public ArgentinianFugazzettaPizza() {
        name = "Argentinian Fugazzetta Pizza";
        dough = "Crust";
        sauce = "Tomato Sauce";

        toppings.add("Onions");
        toppings.add("Mozzarella");
    }
}
