package starbuzz.decorator;

import starbuzz.decorator.beverage.Beverage;
import starbuzz.decorator.beverage.DarkRoast;
import starbuzz.decorator.beverage.Espresso;
import starbuzz.decorator.beverage.HouseBlend;
import starbuzz.decorator.condiments.Mocha;
import starbuzz.decorator.condiments.Soy;
import starbuzz.decorator.condiments.Whip;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
