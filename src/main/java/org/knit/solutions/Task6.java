package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_2.task2_6.Railway;


/**
 Описание:
 Есть автомобили и поезд.

 Если поезд приближается, машины останавливаются и ждут.
 После того, как поезд проедет, машины продолжают движение.
 🔹 Что нужно реализовать?
 ✔ Поток "Поезд" останавливает автомобили (wait()).
 ✔ Поток "Поезд" сообщает о завершении (notifyAll()).
 ✔ Машины ждут, если поезд едет, и продолжают движение после notifyAll().*/

@TaskDescription(taskNumber = 6, taskDescription = "Железнодорожный переезд")
public class Task6 implements Solution {
    @Override
    public void execute() {
        Railway.run();
    }
}
