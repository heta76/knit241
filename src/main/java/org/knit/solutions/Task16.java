package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_5.task16.Character2;
import org.knit.solutions.lab2_5.task16.CharacterFactory;

/**
 Задача:
 Реализуйте систему отображения символов текста на экране.

 Каждый символ (Character) имеет внутреннее состояние (код символа) и внешнее состояние (координаты x, y и стиль).
 Используйте Фабрику приспособленцев, чтобы повторно использовать объекты символов и уменьшить количество объектов, создаваемых в системе.
 📌 Подсказка:
 Внешнее состояние передается в метод render(), а внутреннее хранится внутри объектов, создаваемых фабрикой.
 */
@TaskDescription(taskNumber = 16, taskDescription = "на паттерн Приспособленец (Flyweight)")
public class Task16 implements Solution{

    @Override
    public void execute() {
        System.out.println("Задача 16");
        CharacterFactory factory = new CharacterFactory();

        // Пример текста для отображения
        String text = "HELLO, WORLD!";

        // Для каждого символа из текста получаем объект из фабрики и отрисовываем его
        // Допустим, внешний вид (координаты и стиль) вычисляем простым способом
        int x = 0;
        int y = 0;
        String style = "Bold";  // Пример стиля

        for (char c : text.toCharArray()) {
            // Получаем приспособленец для данного символа
            Character2 character = factory.getCharacter(c);
            // Передаем внешнее состояние в метод render()
            character.render(x, y, style);
            // Изменяем координату x для следующего символа (например, смещение на 10 пикселей)
            x += 10;
        }
    }
}