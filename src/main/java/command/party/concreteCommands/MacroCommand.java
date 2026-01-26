package command.party.concreteCommands;

import command.party.Command;

/**
 * @author Mikhail
 * <p>Новая разновидность команд, которая может выполнять другие команды.</p>
 */
public class MacroCommand implements Command {

    private final Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    /**
     * Команды должны выполняться в обратном порядке, чтобы
     * обеспечить надлежащую функциональность отмены.
     */
    @Override
    public void undo() {
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}
