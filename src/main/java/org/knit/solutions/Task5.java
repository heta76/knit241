package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_2.task2_5.Restaurant;


/**
 📌 Описание:
 В ресторане работает один повар и один официант.

 Повар готовит блюда и ставит их на поднос (максимум 3 блюда).
 Официант берет готовые блюда и подает их клиентам.
 🔹 Что нужно реализовать?
 ✔ Повар не может готовить больше 3 блюд (ждет wait()).
 ✔ Официант ждет, если поднос пуст (wait()).
 ✔ При каждой передаче блюда используется notify().*/

@TaskDescription(taskNumber = 5, taskDescription = "Ресторан: Повар и Официант")
public class Task5 implements Solution {
    @Override
    public void execute() {
        Restaurant.run();
    }
}
