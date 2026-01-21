package singleton.chocolateWithEnum;

public class SingletonChocolateClient {

    public static void main(String[] args) {
        SingletonChocolate chocolate = SingletonChocolate.getInstance();
        chocolate.fill();
        chocolate.boil();
        chocolate.drain();
    }
}
