package starbuzz.starbuzzWithSizes;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	/**
	 * Вычисляет стоимость сои.
	 * <p>Стоимость дополнения зависит от размеров порции кофе.</p>
	 * @return стоимость сои с учетом размера порции.
	 */
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL) {
			cost += .10;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += .15;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += .20;
		}
		return cost;
	}
}
