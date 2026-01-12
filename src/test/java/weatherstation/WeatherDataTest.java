package weatherstation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import weatherstation.weather.observers.MockCelsiusDisplay;
import weatherstation.weather.observers.MockCurrentConditionDisplay;
import weatherstation.weather.subject.WeatherData;

import static org.assertj.core.api.Assertions.assertThat;

public class WeatherDataTest {

    private static final float TEMPERATURE = 80f;
    private static final float HUMIDITY = 65f;
    private static final float PRESSURE = 30.4f;

    @DisplayName(value = "Should return an expected data, when test condition display.")
    @Test
    void shouldReturnExpectedDataWhenTestConditionDisplay() {
        String expectedData = "(" + TEMPERATURE + ", " + HUMIDITY + ")";

        WeatherData weatherData = new WeatherData();

        MockCurrentConditionDisplay currentConditionsDisplay = new MockCurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(TEMPERATURE, HUMIDITY, PRESSURE);

        assertThat(currentConditionsDisplay.getData()).isEqualTo(expectedData);
    }

    @DisplayName(value = "Should return celsius degree, when converting farenheit to celsius.")
    @Test
    void shouldReturnCelsiusDegreeWhenConvertingFarenheitToCelsius() {
        String expectedData = "26.666666";
        WeatherData weatherData = new WeatherData();

        MockCelsiusDisplay mockCelsiusDisplay = new MockCelsiusDisplay(weatherData);
        weatherData.setMeasurements(TEMPERATURE, HUMIDITY, PRESSURE);

        assertThat(mockCelsiusDisplay.getData()).isEqualTo(expectedData);
    }

    @DisplayName(value = "Should switch between data, when changing observers dynamically.")
    @Test
    void shouldSwitchBetweenDataWhenChangingObserversDynamically() {
        String dataBeforeSwitchingObserverDynamic = "(" + TEMPERATURE + ", " + HUMIDITY + ")";
        String dataAfterSwitchingObserverDynamic = "(" + 82.0 + ", " + 70.0 + ")";
        String celsiusData = "27.777779";

        WeatherData weatherData = new WeatherData();

        MockCurrentConditionDisplay currentConditionsDisplay = new MockCurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(TEMPERATURE, HUMIDITY, PRESSURE);

        assertThat(currentConditionsDisplay.getData()).isEqualTo(dataBeforeSwitchingObserverDynamic);

        MockCelsiusDisplay celsiusDisplay = new MockCelsiusDisplay(weatherData);
        weatherData.setMeasurements(82, 70, 29.2f);

        assertThat(currentConditionsDisplay.getData()).isEqualTo(dataAfterSwitchingObserverDynamic);
        assertThat(celsiusDisplay.getData()).isEqualTo(celsiusData);
    }
}
