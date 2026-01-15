package factory.simpleFactory;

import factory.simpleFactory.factory.SimplePizzaFactory;
import factory.simpleFactory.store.PizzaStore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PizzaStoreTest {

    @DisplayName(value = "Should return actual pizza name, when creating pizza using the simple factory.")
    @ParameterizedTest
    @MethodSource("simpleFactoryProvider")
    void shouldReturnActualPizzaNameWhenCreatingPizzaSimpleFactory(String type, String expectedPizzaName) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza(type);
        assertThat(pizza.getName()).isEqualTo(expectedPizzaName);
    }

    private static Stream<Object> simpleFactoryProvider() {
        return Stream.of(
                Arguments.of("cheese", "Cheese Pizza"),
                Arguments.of("pepperoni", "Pepperoni Pizza"),
                Arguments.of("clam", "Clam Pizza"),
                Arguments.of("veggie", "Veggie Pizza")
        );
    }
}
