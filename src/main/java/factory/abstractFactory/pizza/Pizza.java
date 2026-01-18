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
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
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
     *
     * @return описание пиццы
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");

        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
