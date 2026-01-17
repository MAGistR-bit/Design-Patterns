package factory.abstractFactory;

import factory.abstractFactory.ingredients.cheese.Cheese;
import factory.abstractFactory.ingredients.clams.Clams;
import factory.abstractFactory.ingredients.dough.Dough;
import factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import factory.abstractFactory.ingredients.sauce.Sauce;
import factory.abstractFactory.ingredients.veggie.Veggies;

/**
 * @author Mikhail
 * <p>Фабрика для создания ингредиентов.
 * Это позволит решить проблему региональных различий в названии ингредиентов.</p>
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
