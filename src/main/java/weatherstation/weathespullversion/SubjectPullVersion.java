package weatherstation.weathespullversion;

public interface SubjectPullVersion {
    void registerObserver(ObserverPullVersion observer);
    void removeObserver(ObserverPullVersion observer);
    void notifyObservers();
}
