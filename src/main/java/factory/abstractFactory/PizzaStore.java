package factory.abstractFactory;

public abstract class PizzaStore {

    /**
     * Позволяет заказать пиццу в магазине.
     * @param type тип пиццы, которую необходимо заказать
     * @return пицца, заказанная пользователем.
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * Фабричный метод для изготовления пиццы.
     * @param type тип пиццы, которую необходимо приготовить
     * @return приготовленная пицца
     */
    public abstract Pizza createPizza(String type);
}
