package starbuzz.decorator.beverage;

/**
 * @author Mikhail
 * <p>Темный обжаренный кофе.</p>
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
