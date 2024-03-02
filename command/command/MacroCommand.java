package command.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command {
    // java.util.StackはJava Collection Frameworkに含まれないため、使わない
    private Deque<Command> commands = new ArrayDeque<>();

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("Infinite loop caused by append itself");
        }
        commands.push(cmd);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }


}
