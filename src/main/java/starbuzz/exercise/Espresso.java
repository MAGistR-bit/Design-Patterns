package starbuzz.exercise;

public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return .99 + super.cost();
    }
}
