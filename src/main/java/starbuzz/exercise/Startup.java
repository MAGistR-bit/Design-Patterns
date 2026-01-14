package starbuzz.exercise;

/**
 * @author Mikhail
 * <p>Этот вариант очень твердый и хрупкий, так как все дополнения
 * хранятся в суперклассе <code>Beverage</code> и любые изменения
 * потребуют пересмотра этого класса.</p>
 * <p>Помимо этого, некоторые дополнения могут не подойти для новых напитков, которые будут
 * добавлены в будущем, например, чай со льдом.</p>
 */
public class Startup {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();

        Beverage houseBlend = new HouseBlend();
        houseBlend.setMocha(true);
        houseBlend.setWhip(true);
        cashRegister.purchaseBeverage(houseBlend);

        Beverage espresso = new Espresso();
        espresso.setMilk(true);

        cashRegister.purchaseBeverage(espresso);
    }
}
