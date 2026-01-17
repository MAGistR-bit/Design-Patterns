package factory.abstractFactory;

import factory.abstractFactory.ingredients.Cheese;
import factory.abstractFactory.ingredients.Clams;
import factory.abstractFactory.ingredients.Dough;
import factory.abstractFactory.ingredients.Pepperoni;
import factory.abstractFactory.ingredients.Sauce;
import factory.abstractFactory.ingredients.Veggies;

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
