package org.knit.solutions.lab2_4.task2_13;

// Класс пульта, который хранит команду и позволяет её выполнить, а также отменить последнюю команду
public class RemoteControl {
    private Command lastCommand;

    // Устанавливаем команду
    public void setCommand(Command command) {
        this.lastCommand = command;
    }

    // Выполняем команду
    public void pressButton() {
        if (lastCommand != null) {
            lastCommand.execute();
        }
    }

    // Отмена последней выполненной команды
    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}