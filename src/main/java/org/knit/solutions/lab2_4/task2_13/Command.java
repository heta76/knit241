package org.knit.solutions.lab2_4.task2_13;

// Интерфейс команды с методами execute() и undo()
public interface Command {
    void execute();
    void undo();
}