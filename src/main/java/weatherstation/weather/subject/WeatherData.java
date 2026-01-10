package weatherstation.weather.subject;

import weatherstation.weather.Observer;
import weatherstation.weather.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mikhail
 * <p>WeatherData - это объект, который реализует Subject.</p>
 * Он является единственным в отношении "один ко многим"
 * (поддерживает состояние погоды, а затем уведомляет наблюдателей об обновлениях).
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Получает температуру воздуха с метеостанции.
     * @return температура воздуха
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * Получает показатели атмосферного давления с метеостанции.
     * @return атмосферное давление
     */
    public float getPressure() {
        return pressure;
    }

    /**
     * Получает показатели влажности с метеостанции.
     * @return влажность воздуха
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * Метод, который вызывается при каждом
     * обновлении показаний счетчиков.
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float hum, float press) {
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = press;
        measurementsChanged();
    }
}
