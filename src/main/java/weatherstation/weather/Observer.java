package weatherstation.weather;

/**
 * @author Mikhail
 * <p>НАБЛЮДАТЕЛЬ - подписчик, который получает уведомления от СУБЪЕКТА.</p>
 */
public interface Observer {

    /**
     * Обновляет данные наблюдателя, используя информацию,
     * которую передал СУБЪЕКТ.
     * @param temp температура
     * @param humidity влажность
     * @param pressure атмосферное давление
     */
    void update(float temp, float humidity, float pressure);
}
