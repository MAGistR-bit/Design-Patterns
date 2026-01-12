package weatherstation.weathespullversion.subject;

import weatherstation.weathespullversion.ObserverPullVersion;
import weatherstation.weathespullversion.SubjectPullVersion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mikhail
 * <p>Теперь СУБЪЕКТ будет отправлять данные, используя метод <code>update()</code>,
 * а наблюдатели будут получать только те данные, которые им необходимы.</p>
 * Наблюдатели будут вызывать get-методы субъекта.
 */
public class WeatherDataPullVersion implements SubjectPullVersion {
    private final List<ObserverPullVersion> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataPullVersion() {
        observerList = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /**
     * Метод, который вызывается при каждом
     * обновлении показаний счетчиков.
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * Метод, который устанавливает новые измерения, полученные от метеостанции.
     * @param temp температура воздуха
     * @param hum относительная влажность
     * @param press атмосферное давление
     */
    public void setMeasurements(float temp, float hum, float press) {
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = press;
        measurementsChanged();
    }

    @Override
    public void registerObserver(ObserverPullVersion observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(ObserverPullVersion observer) {
        observerList.remove(observer);
    }

    /**
     * Отправка уведомлений субъектом.
     */
    @Override
    public void notifyObservers() {
        for (ObserverPullVersion observer : observerList) {
            observer.update();
        }
    }
}
