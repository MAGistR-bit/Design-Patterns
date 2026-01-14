package starbuzz.starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();

    /**
     * Возвращает объем напитка ({@link CoffeeSize}) для декораторов.
     * @return объем напитка
     */
    public CoffeeSize getSize() {
        return beverage.getSize();
    }
}
