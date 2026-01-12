package starbuzz.decorator.beverage;

/**
 * @author Mikhail
 * <p>Кофе без кофеина.</p>
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
