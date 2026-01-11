package weatherstation.weather.observers;

import weatherstation.weather.DisplayElement;
import weatherstation.weather.Observer;
import weatherstation.weather.Subject;

/**
 * @author Mikhail
 * <p>Экран для отображения текущей сводки погоды.</p>
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private final Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * Обновляет текущую сводку погоды.
     * @param temp температура
     * @param hum влажность
     * @param pressure атмосферное давление
     */
    @Override
    public void update(float temp, float hum, float pressure) {
        this.temperature = temp;
        this.humidity = hum;

        display();  // существуют и более элегантные способы для отображения данных
    }

    /**
     * Метод, который используется для отображения информации на экране.
     * <p>Описание метода находится в {@link DisplayElement#display()}</p>
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                           + "F degrees and " + humidity + "% humidity");
    }
}
