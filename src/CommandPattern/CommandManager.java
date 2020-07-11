package CommandPattern;

import java.util.Stack;

public class CommandManager {
    private Stack<Command> commands = new Stack<Command>();

    public void invoke(Command command) {
        commands.add(command);
        command.execute();
    }

    public void undo() {
        while (!commands.empty()) {
            Command c = commands.pop();
            c.undo();
        }
    }
}
