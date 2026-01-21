package singleton.subclass;

public final class CoolerSingleton extends Singleton {

    protected static CoolerSingleton uniqueInstance;

    private CoolerSingleton() {
        super();
    }
    // useful methods here
}
