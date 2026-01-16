package factory.factoryMethod.pizzaStores;

import factory.factoryMethod.Pizza;
import factory.factoryMethod.PizzaStore;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FactoryMethodPizzaStoreTest {

    @ParameterizedTest
    @MethodSource("factoryMethodPizzaProvider")
    void shouldReturnCorrectArgumentsWhenPizzaCreation(String type, String expectedPizzaName, PizzaStore pizzaStore) {
        Pizza pizza = pizzaStore.orderPizza(type);

        assertThat(pizza.getName()).isEqualTo(expectedPizzaName);
    }

    private static Stream<Arguments> factoryMethodPizzaProvider() {
        return Stream.of(
                Arguments.of("cheese", "NY Style Sauce and Cheese Pizza", new NYPizzaStore()),
                Arguments.of("pepperoni", "Chicago Style Pepperoni Pizza", new ChicagoPizzaStore()),
                Arguments.of("fugazzetta", "Argentinian Fugazzetta Pizza", new ArgentinianPizzaStore())
        );
    }
}
