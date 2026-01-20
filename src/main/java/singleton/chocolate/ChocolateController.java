package singleton.chocolate;

public class ChocolateController {
    public static void main(String[] args) {

        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();

        // will return the existing instance
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
    }
}
