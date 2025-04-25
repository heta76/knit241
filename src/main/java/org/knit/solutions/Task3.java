package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab1.factory.Main3;


/**
 📌 Описание:
 На автозаправочной станции только 2 колонки. Если все заняты, машины ждут в очереди.
 Когда колонка освобождается, следующий автомобиль из очереди начинает заправку.

 🔹 Что нужно реализовать?
 ✔ Использовать wait() и notify() для ожидания и освобождения заправки.
 ✔ Поток "Машина" ждет, если все колонки заняты.
 ✔ Поток "Машина" заправляется, затем освобождает колонку.*/

@TaskDescription(taskNumber = 3, taskDescription = "Factory (Фабрика)")
public class Task3 implements Solution {
    @Override
    public void execute() throws Exception {
        Main3.run();
    }
}