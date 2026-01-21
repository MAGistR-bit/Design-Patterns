package singleton.dcl;

/**
 * @author Mikhail
 * <p>Реализация паттерна Singleton при помощи Double Check Locking.</p>
 */
public final class Singleton {

    private static volatile Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
