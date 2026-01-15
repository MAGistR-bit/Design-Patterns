package factory.abstractFactory;

import factory.abstractFactory.pizzaStores.NYPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("veggie");

        System.out.println("Пицца готова: " + pizza);
    }
}
