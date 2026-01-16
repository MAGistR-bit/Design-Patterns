package factory.factoryMethod;

import factory.factoryMethod.pizzaStores.ArgentinianPizzaStore;
import factory.factoryMethod.pizzaStores.ChicagoPizzaStore;
import factory.factoryMethod.pizzaStores.NYPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("We are ordered a " + pizza);

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pepperoniPizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("We are ordered a " + pepperoniPizza);

        PizzaStore argentinianStore = new ArgentinianPizzaStore();
        Pizza argentinianPizza = argentinianStore.orderPizza("fugazzetta");
        System.out.println("We are ordered a " + argentinianPizza);
    }
}
