package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredients.cheese.Cheese;
import factory.abstractFactory.ingredients.clams.Clams;
import factory.abstractFactory.ingredients.dough.Dough;
import factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import factory.abstractFactory.ingredients.sauce.Sauce;
import factory.abstractFactory.ingredients.veggie.Veggies;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    /**
     * Подготавливает ингредиенты, необходимые
     * для приготовления пиццы.
     */
    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place Pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Отображает описание пиццы.
     * @return описание пиццы
     */
    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        display.append(clam).append("\n");
        display.append(pepperoni).append("\n");
        display.append(cheese).append("\n");

        for (Veggies veggie : veggies) {
            display.append(veggie).append("\n");
        }
        return display.toString();
    }
}
