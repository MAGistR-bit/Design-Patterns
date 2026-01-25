package command.party.invoker;

import command.party.Command;
import command.party.NoCommand;

/**
 * @author Mikhail
 * <p>Пульт управления (инициатор), который поддерживает
 * команды включения/выключения. </p>
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    /**
     * Конструктор, который создает экземпляры
     * команд и инициализирует массивы.
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /**
     * Устанавливает команды для включения/выключения определенной ячейки.
     *
     * @param slot       ячейка, за которой закрепляются команды
     * @param onCommand  команда для включения
     * @param offCommand команда для выключения
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    /**
     * Выполнение команды при нажатии на кнопку включения.
     *
     * @param slot ячейка
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    /**
     * Выполнение команды при нажатии на кнопку выключения.
     *
     * @param slot ячейка
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    /**
     * Отменяет операцию последней выполненной команды.
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    /**
     * Отражает все ячейки с соответствующими командами.
     * @return название всех ячеек.
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n---- Remote Control ----\n");
        for (int i = 0; i < onCommands.length; i++) {
            buffer.append("[slot ").append(i).append("]: ")
                    .append(onCommands[i].getClass().getName())
                    .append("   ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n")
            ;
        }
        buffer.append("[undo] ").append(undoCommand.getClass().getName()).append("\n");
        return buffer.toString();
    }
}
