package starbuzz.starbuzzWithSizes;

import starbuzz.starbuzzWithSizes.beverages.DarkRoast;
import starbuzz.starbuzzWithSizes.beverages.Espresso;
import starbuzz.starbuzzWithSizes.beverages.HouseBlend;
import starbuzz.starbuzzWithSizes.condiments.Mocha;
import starbuzz.starbuzzWithSizes.condiments.Soy;
import starbuzz.starbuzzWithSizes.condiments.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()
				+ " $" + String.format("%.2f", beverage.cost()));

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()
				+ " $" + String.format("%.2f", beverage2.cost()));

		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(CoffeeSize.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()
				+ " $" + String.format("%.2f", beverage3.cost()));
	}
}
