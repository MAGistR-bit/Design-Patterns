package starbuzz.starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();

    public CoffeeSize getSize() {
        return beverage.getSize();
    }
}
