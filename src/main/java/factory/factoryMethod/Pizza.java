package factory.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    /**
     * Отображает сообщение о том, что пицца наполняется ингредиентами.
     */
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding sauce... ");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    /**
     * Отображает сообщение, говорящее о том, что пицца выпекается.
     */
    public void bake() {
        System.out.println("Bake for 25 minutes at 350.");
    }

    /**
     * Отображает сообщение, говорящее о том, что пицца нарезается.
     */
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    /**
     * Отображает сообщение, говорящее о том, что пицца упаковывается в коробку.
     */
    public void box() {
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");

        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
