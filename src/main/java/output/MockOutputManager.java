package output;

public class MockOutputManager implements OutputManager {

    private boolean invoked = false;
    private String inputData;

    @Override
    public void print(String toPrint) {
        invoked = true;
        inputData = toPrint;
    }

    public boolean printIsInvoked() {
        return invoked;
    }

    public String getPrintInput() {
        return inputData;
    }
}
