package factory.abstractFactory.stores;

import factory.abstractFactory.pizza.Pizza;

public abstract class PizzaStore {

    /**
     * Позволяет заказать пиццу в магазине.
     * @param type тип пиццы, которую необходимо заказать
     * @return пицца, заказанная пользователем.
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
