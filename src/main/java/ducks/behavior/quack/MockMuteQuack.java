package ducks.behavior.quack;

import output.OutputManager;

public class MockMuteQuack implements QuackBehavior {

    private OutputManager outputManager;

    public MockMuteQuack(OutputManager outputManager) {
        this.outputManager = outputManager;
    }

    @Override
    public void quack() {
        outputManager.print("<<< Silence >>>");
    }
}
