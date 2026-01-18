package factory.abstractFactory.stores;

import factory.abstractFactory.PizzaIngredientFactory;
import factory.abstractFactory.ingredients.factory.nyFactory.NYPizzaIngredientFactory;
import factory.abstractFactory.pizza.CheesePizza;
import factory.abstractFactory.pizza.ClamPizza;
import factory.abstractFactory.pizza.PepperoniPizza;
import factory.abstractFactory.pizza.Pizza;
import factory.abstractFactory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory =  new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            }
            default -> throw new IllegalArgumentException("Unsupported Pizza Type.");
        }

        return pizza;
    }
}
