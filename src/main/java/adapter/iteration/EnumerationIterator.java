package adapter.iteration;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Mikhail
 * <p>Адаптер для работы с целевым интерфейсом {@code Iterator}.</p>
 */
public class EnumerationIterator implements Iterator<Object> {

    private final Enumeration<?> enumeration;

    /**
     * Сохраняем адаптируемый объект в конструкторе.
     * Используется композиция.
     * @param enumeration адаптируемый объект
     */
    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * Поддержать метод {@code remove()} не удастся,
     * поэтому выбрасывается исключение.
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
