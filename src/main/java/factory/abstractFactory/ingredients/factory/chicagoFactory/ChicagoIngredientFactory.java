package factory.abstractFactory.ingredients.factory.chicagoFactory;

import factory.abstractFactory.PizzaIngredientFactory;
import factory.abstractFactory.ingredients.cheese.Cheese;
import factory.abstractFactory.ingredients.cheese.MozzarellaCheese;
import factory.abstractFactory.ingredients.clams.Clams;
import factory.abstractFactory.ingredients.clams.FrozenClams;
import factory.abstractFactory.ingredients.dough.Dough;
import factory.abstractFactory.ingredients.dough.ThinCrustDough;
import factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import factory.abstractFactory.ingredients.sauce.PlumTomatoSauce;
import factory.abstractFactory.ingredients.sauce.Sauce;
import factory.abstractFactory.ingredients.veggie.BlackOlives;
import factory.abstractFactory.ingredients.veggie.EggPlant;
import factory.abstractFactory.ingredients.veggie.Spinach;
import factory.abstractFactory.ingredients.veggie.Veggies;

/**
 * @author Mikhail
 * <p>Фабрика по производству ингредиентов для Чикаго.</p>
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Spinach(), new BlackOlives(), new EggPlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
