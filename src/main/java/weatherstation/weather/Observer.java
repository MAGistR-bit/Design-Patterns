package weatherstation.weather;

/**
 * @author Mikhail
 * <p>НАБЛЮДАТЕЛЬ - подписчик, который получает уведомления от СУБЪЕКТА.</p>
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
