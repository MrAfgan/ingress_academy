package lesson25.task10;

import java.util.ArrayList;
import java.util.List;

public class Main extends Task10 {
    public static void main(String[] args) {
        List<String> actions = new ArrayList<>();
        actions.add("User clicked mouse right button");
        actions.add("User restarts the system");
        actions.add("User opens Opera browser");
        actions.add("User opens Task manager");
        actions.add("User opens Microsoft Office");
        actions.add("User deleted Photo001.jpg in directory C:\\Users\\AFGAN\\Downloads\\Music");
        logResult(actions, logAdder);
    }
}
