package starbuzz.decorator.beverage;

/**
 * @author Mikhail
 * <p>Абстрактный класс, представляющий собой напиток.</p>
 */
public abstract class Beverage {

    protected String description = "Unknown BeverageWithSize";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
