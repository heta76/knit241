package org.knit.solutions.lab2_5.task15;

// Реальный объект изображения, который имитирует загрузку с сервера.
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    // Метод, имитирующий задержку при загрузке изображения с сервера.
    private void loadFromServer() {
        System.out.println("Загрузка изображения с сервера: " + fileName);
        try {
            Thread.sleep(3000); // имитация задержки (например, 3 секунды)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Отображение изображения: " + fileName);
    }
}
