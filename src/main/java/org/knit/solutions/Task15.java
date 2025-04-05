package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_5.task14.*;
import org.knit.solutions.lab2_5.task15.Image;
import org.knit.solutions.lab2_5.task15.ImageProxy;

/**
 Задача:
 Создайте удаленную библиотеку изображений.

 При запросе изображения оно загружается с сервера (имитация через задержку в коде).
 Картинка хранится как объект класса RealImage.
 Прокси-объект ImageProxy должен лениво загружать изображение и кэшировать его для повторного использования.
 📌 Подсказка:
 ImageProxy должен проверять, создан ли объект RealImage. Если нет — создавать его.
 */
@TaskDescription(taskNumber = 15, taskDescription = "на паттерн Прокси (Proxy)")
public class Task15 implements Solution{

    @Override
    public void execute() {
        System.out.println("Задача 15");

        Image[] images = {
                new ImageProxy("pic1.jpg"),
                new ImageProxy("pic2.jpg"),
                new ImageProxy("pic3.jpg")
        };

        images[1].display(); // загружается только pic2.jpg
        images[0].display(); // загружается только pic1.jpg
        images[1].display(); // повторной загрузки нет — используется кэш
    }
}