package factory.simpleFactory;

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
    }

    /**
     * Отображает сообщение, говорящее о том, что пицца выпекается.
     */
    public void bake() {
        System.out.println("Baking " + name);
    }

    /**
     * Отображает сообщение, говорящее о том, что пицца нарезается.
     */
    public void cut() {
        System.out.println("Cutting " + name);
    }

    /**
     * Отображает сообщение, говорящее о том, что пицца упаковывается в коробку.
     */
    public void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");

        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
