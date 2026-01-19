package factory.abstractFactory;

import factory.abstractFactory.pizza.Pizza;
import factory.abstractFactory.stores.ChicagoPizzaStore;
import factory.abstractFactory.stores.NYPizzaStore;
import factory.abstractFactory.stores.PizzaStore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AbstractFactoryTest {

    @DisplayName(value = "Should return an actual pizza name, when order pizza with abstract factory.")
    @ParameterizedTest
    @MethodSource(value = "abstractFactoryMethodPizzaProvider")
    void shouldReturnActualPizzaNameWhenOrderPizzaWithAbstractFactory(PizzaStore pizzaStore, String pizzaType, String expectedPizzaName) {
        Pizza pizza = pizzaStore.orderPizza(pizzaType);
        assertThat(pizza.getName()).isEqualTo(expectedPizzaName);
    }

    private static Stream<Arguments> abstractFactoryMethodPizzaProvider() {
        return Stream.of(
                Arguments.of(new NYPizzaStore(), "cheese", "New York Style Cheese Pizza"),
                Arguments.of(new NYPizzaStore(), "pepperoni", "New York Style Pepperoni Pizza"),
                Arguments.of(new ChicagoPizzaStore(), "veggie", "Chicago Style Veggie Pizza"),
                Arguments.of(new ChicagoPizzaStore(), "clam", "Chicago Style Clam Pizza"),
                Arguments.of(new NYPizzaStore(), "clam", "New York Style Clam Pizza")
        );
    }

}