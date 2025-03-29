package org.knit.solutions.lab2_4.task2_12;

// Класс Memento, который хранит состояние текста
public class Memento {
    private final String text;

    public Memento(String text) {
        this.text = text;
    }

    // Метод для получения сохранённого состояния
    public String getText() {
        return text;
    }
}
