package numberguessing.console;

import numberguessing.PositiveIntegerGenerator;

public final class AppModel {
    private final static String NEW_LINE = System.lineSeparator();
    private boolean completed;

    public AppModel(PositiveIntegerGenerator generator) {
        completed = false;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String flushOutput() {
        return "1: Single player game" + NEW_LINE + "2: Multiplayer game" + NEW_LINE + "3: Exit"
                + NEW_LINE + "Enter selection: ";
    }

    public void processInput(String input) {
        if (input.equals("3")) completed = true;
    }

}
