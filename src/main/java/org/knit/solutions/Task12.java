package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_4.task2_11.EmailNotifier;
import org.knit.solutions.lab2_4.task2_11.MobileApp;
import org.knit.solutions.lab2_4.task2_11.Stock;
import org.knit.solutions.lab2_4.task2_11.StockObserver;
import org.knit.solutions.lab2_4.task2_12.Caretaker;
import org.knit.solutions.lab2_4.task2_12.TextEditor;

/**
 **Задача 12: Реализация системы отмены изменений в текстовом редакторе**

 Разработайте систему, позволяющую сохранять состояния текста в редакторе и откатывать изменения назад.

 **Требуется:**
 - Создать класс `TextEditor`, который содержит текущий текст документа.
 - Создать класс `Memento`, который будет хранить снимок состояния текста.
 - Реализовать `Caretaker`, который управляет историей изменений (например, стек сохранённых состояний).
 - Реализовать методы `saveState()` и `undo()` для сохранения и отката изменений.

 **Пример работы:**
 1. Пользователь вводит текст "Hello, world!".
 2. Он сохраняет текущее состояние.
 3. Затем добавляет " How are you?".
 4. Нажимает "Отменить" и возвращается к "Hello, world!". */

@TaskDescription(taskNumber = 12, taskDescription = "Паттерн Memento (Хранитель)")
public class Task12 implements Solution {
    @Override
    public void execute() {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Пользователь вводит текст и сохраняет состояние
        editor.setText("Hello, world!");
        caretaker.save(editor);
        System.out.println("Сохраненное состояние: " + editor.getText());

        // Пользователь вносит изменения в текст и сохраняет состояние
        editor.setText(editor.getText() + " How are you?");
        caretaker.save(editor);
        System.out.println("Измененный текст: " + editor.getText());

        // Пользователь вносит изменения в текст
        editor.setText(editor.getText() + " I'm fine.");
        System.out.println("Измененный текст: " + editor.getText());

        // Откат изменений - возвращаемся к предыдущему сохраненному состоянию
        caretaker.undo(editor);
        System.out.println("После отката: " + editor.getText());
        caretaker.undo(editor);
        System.out.println("После отката: " + editor.getText());

        // Пользователь вносит изменения в текст и сохраняет состояние
        editor.setText(editor.getText() + " Who are you?");
        caretaker.save(editor);
        System.out.println("Измененный текст: " + editor.getText());


        caretaker.undo(editor);
        System.out.println("После отката: " + editor.getText());
        caretaker.undo(editor);
        System.out.println("После отката: " + editor.getText());
    }
}