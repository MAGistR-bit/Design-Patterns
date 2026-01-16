package factory.factoryMethod;

import factory.factoryMethod.pizzaStores.ChicagoPizzaStore;
import factory.factoryMethod.pizzaStores.NYPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println(pizza);

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pepperoniPizza = chicagoStore.orderPizza("pepperoni");
        System.out.println(pepperoniPizza);
    }
}
