package weatherstation.weather;

/**
 * @author Mikhail
 * <p>Издатель - СУБЪЕКТ, который рассылает уведомления наблюдателям.</p>
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
