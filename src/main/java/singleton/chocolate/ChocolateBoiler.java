package singleton.chocolate;

public final class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    /**
     * Наполняет нагреватель молочно-шоколадной смесью.
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling the boiler with milk-chocolate mixture");
        }
    }

    /**
     * Сливает содержимое, удостоверившись в том, что
     * нагреватель не пуст, а смесь доведена до кипения.
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Drain the heated milk and chocolate");
        }
    }

    /**
     * Кипятит смесь, проверив, что нагреватель полон, но еще
     * не нагрет.
     */
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Bring the contents to a boil");
        }
    }
}
