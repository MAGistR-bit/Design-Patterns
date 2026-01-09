package ducks.behavior.quack;

import output.OutputManager;

public class MockSqueak implements QuackBehavior {

    private OutputManager outputManager;

    public MockSqueak(OutputManager outputManager) {
        this.outputManager = outputManager;
    }

    @Override
    public void quack() {
        outputManager.print("Squeak");
    }
}
