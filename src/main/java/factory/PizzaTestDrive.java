package factory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");

        System.out.println("Name of pizza: " + cheesePizza.getName());
        System.out.println(cheesePizza);
    }
}
