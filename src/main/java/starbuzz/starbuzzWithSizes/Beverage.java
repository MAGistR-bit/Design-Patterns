package starbuzz.starbuzzWithSizes;

public abstract class Beverage {

    protected CoffeeSize size = CoffeeSize.TALL;
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    public CoffeeSize getSize() {
        return this.size;
    }

    public abstract double cost();
}
