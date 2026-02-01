package adapter.ducks;

/**
 * @author Mikhail
 * <p><b>Паттерн Адаптер.</b></p>
 * <p>Реализуем интерфейс того типа, на который
 * рассчитан клиент. В нашем случае - интерфейс {@code Duck}.</p>
 */
public class TurkeyAdapter implements Duck {
    private final Turkey turkey;

    /**
     * Получаем ссылку на адаптируемый объект в конструкторе.
     * @param turkey индейка (ссылка на адаптируемый объект).
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
