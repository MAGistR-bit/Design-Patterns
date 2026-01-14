package starbuzz.exercise;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend");
    }

    @Override
    public double cost() {
        return .99 + super.cost();
    }
}
