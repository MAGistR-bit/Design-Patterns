package adapter.ducks;

import adapter.ducks.concreteDuck.MallardDuck;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        DuckAdapter duckAdapter = new DuckAdapter(mallardDuck);

        for (int i = 0; i < 10; i++) {
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
