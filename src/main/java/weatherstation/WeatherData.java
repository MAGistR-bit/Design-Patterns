package weatherstation;

/**
 * @author Mikhail
 * <p>WeatherData - это объект, который реализует Subject.</p>
 * Он является единственным в отношении "один ко многим"
 * (поддерживает состояние погоды, а затем уведомляет наблюдателей об обновлениях).
 */
public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

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
     * Метод вызывается при каждом
     * обновлении показаний счетчиков.
     */
    public void measurementsChanged() {
        // your code
    }
}
