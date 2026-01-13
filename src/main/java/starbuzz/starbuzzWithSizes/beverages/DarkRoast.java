package starbuzz.starbuzzWithSizes.beverages;

import starbuzz.starbuzzWithSizes.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}

