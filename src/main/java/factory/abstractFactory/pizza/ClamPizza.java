package factory.abstractFactory.pizza;

import factory.abstractFactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        name = "Clam Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClams();
    }
}
