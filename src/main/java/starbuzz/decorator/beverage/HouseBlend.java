package starbuzz.decorator.beverage;

/**
 * @author Mikhail
 * <p>Домашний купаж.</p>
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
