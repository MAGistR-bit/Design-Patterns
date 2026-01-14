package starbuzz.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import starbuzz.decorator.beverage.Beverage;
import starbuzz.decorator.beverage.Espresso;
import starbuzz.decorator.condiments.Mocha;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StarBuzzCoffeeTest {

    @DisplayName(value = "Should return actual cost, when cost Espresso.")
    @Test
    void shouldReturnActualCostWhenCostCalculationForEspresso() {
        // Given
        double expectedCost = 1.99;
        Beverage espresso = new Espresso();

        // When
        double actualCost = espresso.cost();

        // Then
        assertEquals(expectedCost, actualCost, 0.01);
    }

    @DisplayName(value = "Should return actual description, when retrieval description for Espresso.")
    @Test
    void shouldReturnActualDescriptionWhenRetrievalDescriptionForEspresso() {
        // Given
        String expectedDescription = "Espresso";
        Beverage espresso = new Espresso();

        // When
        String actualDescription = espresso.getDescription();

        // Then
        assertThat(expectedDescription).isEqualTo(actualDescription);
    }

    @DisplayName(value = "Should return null, when base beverage with NULL description.")
    @Test
    void shouldReturnNullWhenUseBaseBeverageWithNullDescription() {
        Beverage beverage = new Beverage() {

            {
                description = null;
            }

            @Override
            public double cost() {
                return 1.26;
            }
        };

        // When
        String actualDescription = beverage.getDescription();

        // Then
        assertThat(actualDescription).isNull();
    }

    @DisplayName(value = "Should thrown Null Pointer Exception, when decorator have null beverage.")
    @Test
    void shouldThrownNullPointerExceptionWhenDecoratorWithNullBeverage() {

        // When & Then
        assertThrows(NullPointerException.class, () -> {
            Mocha mocha = new Mocha(null);
            mocha.cost();
        });
    }
}
