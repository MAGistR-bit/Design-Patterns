package starbuzz.starbuzzWithSizes;

public abstract class Beverage {

	CoffeeSize size = CoffeeSize.TALL;
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public void setSize(CoffeeSize size) {
		this.size = size;
	}

	public CoffeeSize getSize() {
		return this.size;
	}

	public abstract double cost();
}
