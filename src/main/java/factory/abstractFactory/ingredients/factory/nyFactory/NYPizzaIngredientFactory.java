package factory.abstractFactory.ingredients.factory.nyFactory;

import factory.abstractFactory.PizzaIngredientFactory;
import factory.abstractFactory.ingredients.cheese.Cheese;
import factory.abstractFactory.ingredients.clams.Clams;
import factory.abstractFactory.ingredients.cheese.ReggianoCheese;
import factory.abstractFactory.ingredients.clams.FreshClams;
import factory.abstractFactory.ingredients.dough.Dough;
import factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import factory.abstractFactory.ingredients.sauce.MarinaraSauce;
import factory.abstractFactory.ingredients.sauce.Sauce;
import factory.abstractFactory.ingredients.veggie.Garlic;
import factory.abstractFactory.ingredients.veggie.Mushroom;
import factory.abstractFactory.ingredients.veggie.Onion;
import factory.abstractFactory.ingredients.veggie.RedPepper;
import factory.abstractFactory.ingredients.veggie.Veggies;
import factory.abstractFactory.ingredients.dough.ThinCrustDough;

/**
 * @author Mikhail
 * <p>Нью-Йоркская фабрика ингредиентов, которая реализует общий
 * интерфейс всех фабрик ингредиентов.</p>
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
