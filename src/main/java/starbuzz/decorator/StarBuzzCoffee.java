package starbuzz.decorator;

import starbuzz.decorator.beverage.Beverage;
import starbuzz.decorator.beverage.DarkRoast;
import starbuzz.decorator.condiments.CondimentDecorator;
import starbuzz.decorator.condiments.Milk;
import starbuzz.decorator.condiments.Mocha;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        CondimentDecorator milk = new Milk(darkRoast);
        CondimentDecorator mocha = new Mocha(milk);

        System.out.println("Description first beverage: " + milk.getDescription());
        System.out.println("Cost first beverage: " + milk.cost());

        System.out.println("Description second beverage: " + mocha.getDescription());
        System.out.println("Cost second beverage: " + mocha.cost());
    }
}
