package factory.abstractFactory.stores;

import factory.abstractFactory.PizzaIngredientFactory;
import factory.abstractFactory.ingredients.factory.chicagoFactory.ChicagoIngredientFactory;
import factory.abstractFactory.pizza.CheesePizza;
import factory.abstractFactory.pizza.ClamPizza;
import factory.abstractFactory.pizza.PepperoniPizza;
import factory.abstractFactory.pizza.Pizza;
import factory.abstractFactory.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            }
            default -> throw new IllegalArgumentException("Unsupported pizza type.");
        }

        return pizza;
    }
}
