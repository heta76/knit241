package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_2.task2_4.Main2;


/**
 📌 Описание:
 На автозаправочной станции только 2 колонки. Если все заняты, машины ждут в очереди.
 Когда колонка освобождается, следующий автомобиль из очереди начинает заправку.

 🔹 Что нужно реализовать?
 ✔ Использовать wait() и notify() для ожидания и освобождения заправки.
 ✔ Поток "Машина" ждет, если все колонки заняты.
 ✔ Поток "Машина" заправляется, затем освобождает колонку.*/

@TaskDescription(taskNumber = 4, taskDescription = "Автозаправочная станция")
public class Task4 implements Solution {
    @Override
    public void execute() {
        Main2.run();
    }
}