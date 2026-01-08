package ducks.behavior.fly;

import output.OutputManager;

public class MockFlyNoWay implements FlyBehavior {

    private OutputManager outputManager;

    public MockFlyNoWay(OutputManager output) {
        this.outputManager = output;
    }

    @Override
    public void fly() {
        outputManager.print("I can't fly!");
    }
}
