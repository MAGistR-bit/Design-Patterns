package singleton;

/**
 * @author Mikhail
 * <p>Классическая реализация паттерна Одиночка.</p>
 */
public final class Singleton {

    /**
     * Статическая переменная для хранения единственного экземпляра.
     */
    private static Singleton uniqueInstance;

    /**
     * Приватный конструктор.
     * <p>Только Singleton
     * может создавать экземпляры этого класса.</p>
     */
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
