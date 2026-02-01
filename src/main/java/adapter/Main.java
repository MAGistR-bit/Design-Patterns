package adapter;

public class Main {
    public static void main(String[] args) {

        TurkeyAdapter adapter = new TurkeyAdapter(new Turkey() {
            @Override
            public void gobble() {
                System.out.println("I'm gobble");
            }

            @Override
            public void fly() {
                System.out.println("I'm flying");
            }
        });

        adapter.quack();
        adapter.fly();
    }
}
