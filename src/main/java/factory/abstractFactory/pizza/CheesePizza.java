package factory.abstractFactory.pizza;

import factory.abstractFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    /**
     * В ходе приготовления пиццы понадобится фабрика,
     * поставляющая ингредиенты. Соответственно,
     * конструктору каждого класса пиццы передается объект фабрики.
     * @param ingredientFactory фабрика для приготовления ингредиентов
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "Cheese Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * Приготовление пиццы. Когда методу требуется очередной
     * ингредиент, он запрашивает его у фабрики.
     */
    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
