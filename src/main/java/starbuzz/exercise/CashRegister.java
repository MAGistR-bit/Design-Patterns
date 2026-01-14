package starbuzz.exercise;

/**
 * @author Mikhail
 * <p>Контрольно-кассовый аппарат.</p>
 */
public class CashRegister {

    public void purchaseBeverage(Beverage beverage) {
        double cost = beverage.cost();
        String description = beverage.getDescription();
        System.out.println("The fee for your " + description + " is: "
                           + String.format("%.2f", cost) + "$");
    }
}
