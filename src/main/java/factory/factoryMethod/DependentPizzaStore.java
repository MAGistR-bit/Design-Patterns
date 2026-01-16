package factory.factoryMethod;

import factory.factoryMethod.stylePizzas.chicago.ChicagoStyleCheesePizza;
import factory.factoryMethod.stylePizzas.chicago.ChicagoStyleClamPizza;
import factory.factoryMethod.stylePizzas.chicago.ChicagoStylePepperoniPizza;
import factory.factoryMethod.stylePizzas.chicago.ChicagoStyleVeggiePizza;
import factory.factoryMethod.stylePizzas.ny.NYStyleCheesePizza;
import factory.factoryMethod.stylePizzas.ny.NYStyleClamPizza;
import factory.factoryMethod.stylePizzas.ny.NYStyleVeggiePizza;

/**
 * @author Mikhail
 * <p>Этот вариант является плохим, поскольку модуль
 * верхнего уровня <code>PizzaStore</code> зависит от
 * модулей нижнего уровня (конкретных видов пиццы).</p>
 * Мы должны зависеть от абстракций, а не от конкретных классов.
 * На помощь приходит Фабричный Метод.
 */
public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new NYStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new NYStyleClamPizza();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new ChicagoStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
