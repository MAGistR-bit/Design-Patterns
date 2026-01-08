package ducks.behavior.fly;

import output.OutputManager;

public class MockFlyRocketPowered implements FlyBehavior {

    private OutputManager outputManager;

    public MockFlyRocketPowered(OutputManager output) {
        this.outputManager = output;
    }

    @Override
    public void fly() {
        outputManager.print("I'm flying with a rocket");
    }
}
