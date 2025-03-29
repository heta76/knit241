package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_4.task2_11.EmailNotifier;
import org.knit.solutions.lab2_4.task2_11.MobileApp;
import org.knit.solutions.lab2_4.task2_11.Stock;
import org.knit.solutions.lab2_4.task2_11.StockObserver;
import org.knit.solutions.lab2_4.task2_12.Caretaker;
import org.knit.solutions.lab2_4.task2_12.TextEditor;
import org.knit.solutions.lab2_4.task2_13.*;

/**
 Задача 13: Реализация системы команд для управления умным домом

 Вы разрабатываете систему управления "умным домом", где пользователь может выполнять различные команды, такие как включение/выключение света, управление телевизором и кондиционером.

 Требуется:

 Создать интерфейс Command, который определяет метод execute().
 Реализовать классы команд:
 LightOnCommand – включает свет.
 LightOffCommand – выключает свет.
 TVOnCommand – включает телевизор.
 TVOffCommand – выключает телевизор.
 Создать класс RemoteControl, который хранит команду и позволяет её выполнить.
 Реализовать механизм отмены последней команды (undo).
 Пример работы:

 Пользователь нажимает кнопку "Включить свет" – выполняется LightOnCommand.
 Затем нажимает "Выключить телевизор" – выполняется TVOffCommand.
 Пользователь нажимает "Отменить последнюю команду" – телевизор снова включается.
 Дополнительно: Реализуйте поддержку макрокоманд (например, кнопка "Спокойной ночи" выключает все приборы разом).*/

@TaskDescription(taskNumber = 13, taskDescription = "Паттерн Command (Команда)")
public class Task13 implements Solution {
    @Override
    public void execute() {
        // Создаем устройства
        Light livingRoomLight = new Light();
        TV livingRoomTV = new TV();

        // Создаем конкретные команды
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command tvOn = new TVOnCommand(livingRoomTV);
        Command tvOff = new TVOffCommand(livingRoomTV);

        // Создаем пульт управления
        RemoteControl remote = new RemoteControl();

        // Пример 1: Включение света
        System.out.println("Нажатие кнопки 'Включить свет':");
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.pressUndo();

        // Пример 2: Выключение телевизора
        System.out.println("\nНажатие кнопки 'Выключить телевизор':");
        remote.setCommand(tvOff);
        remote.pressButton();

        // Отмена последней команды: телевизор снова включается
        System.out.println("\nОтмена последней команды:");
        remote.pressUndo();

        // Пример макрокоманды: "Спокойной ночи" - выключить свет и телевизор
        System.out.println("\nНажатие кнопки 'Спокойной ночи' (выключение всех приборов):");
        Command[] nightCommands = { lightOff, tvOff };
        Command nightMacro = new MacroCommand(nightCommands);
        remote.setCommand(nightMacro);
        remote.pressButton();

        // Отмена макрокоманды: приборы снова включаются в обратном порядке
        System.out.println("\nОтмена макрокоманды 'Спокойной ночи':");
        remote.pressUndo();
    }
}
