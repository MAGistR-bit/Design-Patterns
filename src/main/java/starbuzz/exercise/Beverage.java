package starbuzz.exercise;

/**
 * @author Mikhail
 * <p>Напишите методы <code>cost()</code> для следующих классов.</p>
 */
public abstract class Beverage {

    private String description;
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    /**
     * Метод вычисления стоимости кофе.
     * <p>Многократное использование блоков if приводит к проблемам.</p>
     * @return стоимость кофе.
     */
    public double cost() {
        double condimentCost = 0.0;

        if (hasMilk()) {
            condimentCost += .10;
        }

        if (hasMocha()) {
            condimentCost += .15;
        }

        if (hasSoy()) {
            condimentCost += .20;
        }

        if (hasWhip()) {
            condimentCost += .25;
        }
        return condimentCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
