package weatherstation.weather.observers;

import weatherstation.weather.DisplayElement;
import weatherstation.weather.Observer;
import weatherstation.weather.Subject;

public class MockCelsiusDisplay implements Observer, DisplayElement {

    private float temperatureFarenheit;
    private String data;
    private final Subject weatherData;

    public MockCelsiusDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperatureFarenheit = temp;
        display();
    }

    @Override
    public void display() {
        data = "" + convertIntoCelsius(temperatureFarenheit);
    }

    private float convertIntoCelsius(float temp) {
        return (temperatureFarenheit - 32) * 5 / 9;
    }

    public String getData() {
        return data;
    }
}
