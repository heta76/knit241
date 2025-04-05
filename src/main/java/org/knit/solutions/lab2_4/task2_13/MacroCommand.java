package org.knit.solutions.lab2_4.task2_13;

// Макрокоманда, выполняющая набор команд
public class MacroCommand implements Command {
    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        // Отмена команд в обратном порядке
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}