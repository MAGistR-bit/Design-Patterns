package factory.factoryMethod;

import factory.factoryMethod.pizzaStores.ArgentinianPizzaStore;
import factory.factoryMethod.pizzaStores.ChicagoPizzaStore;
import factory.factoryMethod.pizzaStores.NYPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore argentinianStore = new ArgentinianPizzaStore();

        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = argentinianStore.orderPizza("fugazzetta");
        System.out.println("Oksana is ordered a " + pizza.getName() + "\n");

        DependentPizzaStore pizzaStore = new DependentPizzaStore();
        Pizza dependentPizza = pizzaStore.createPizza("NY", "cheese");
        System.out.println("James is ordered a " + dependentPizza.getName() + "\n");
    }
}
