package org.knit.solutions.lab2_5.task15;

// Прокси-объект, который лениво загружает RealImage и кэширует его для повторного использования.
public class ImageProxy implements Image {
    private String fileName;
    private RealImage realImage; // кэшированное изображение

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Если изображение ещё не загружено, загружаем его
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        // Используем уже загруженное изображение для отображения
        realImage.display();
    }
}
