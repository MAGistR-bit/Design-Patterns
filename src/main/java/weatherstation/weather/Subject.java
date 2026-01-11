package weatherstation.weather;

/**
 * @author Mikhail
 * <p>Издатель - СУБЪЕКТ.</p>
 */
public interface Subject {

    /**
     * Регистрирует наблюдателя.
     * @param observer наблюдатель, который хочет получать уведомления от субъекта.
     */
    void registerObserver(Observer observer);

    /**
     * Исключает наблюдатель из списка.
     * @param observer наблюдатель, который больше не хочет получать уведомления
     *                 от субъекта.
     */
    void removeObserver(Observer observer);

    /**
     * Оповещает наблюдателей об изменении состояния субъекта.
     */
    void notifyObservers();
}
