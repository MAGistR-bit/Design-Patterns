package factory.abstractFactory;

import factory.abstractFactory.pizza.Pizza;
import factory.abstractFactory.stores.NYPizzaStore;
import factory.abstractFactory.stores.PizzaStore;

public class StartupAbstractFactory {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
