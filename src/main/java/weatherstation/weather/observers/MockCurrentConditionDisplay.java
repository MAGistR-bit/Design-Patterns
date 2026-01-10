package weatherstation.weather.observers;

import weatherstation.weather.DisplayElement;
import weatherstation.weather.Observer;
import weatherstation.weather.Subject;

public class MockCurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private String data;
    private final Subject weatherData;

    public MockCurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float hum, float pressure) {
        this.temperature = temp;
        this.humidity = hum;
        display();
    }

    @Override
    public void display() {
        data = "(" + temperature + ", " + humidity + ")";
    }

    public String getData() {
        return data;
    }
}
