package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_5.task14.*;

/**
 * Задача:
 * Создайте систему управления файловыми объектами.
 * Есть три типа файловых объектов:
 *
 * Файлы,
 * Папки,
 * Ссылки (ярлыки).
 * Требуется реализовать два посетителя:
 *
 * Сканер вирусов, который проверяет каждый файл на наличие вирусов.
 * Анализатор размера, который подсчитывает общий размер файлов (ссылки не учитываются).
 * Подсказка:
 * Каждый файл, папка и ссылка должны реализовывать интерфейс FileSystemElement. В accept() методе вызывается соответствующий метод визитера.
 */
@TaskDescription(taskNumber = 14, taskDescription = "на паттерн Визитер (Visitor)")
public class Task14 implements Solution{

    @Override
    public void execute() {
        System.out.println("Задача 14");
        // Создаем файловые объекты
        File file1 = new File("document.txt", 1200);
        File file2 = new File("photo.jpg", 2400);
        Folder folder1 = new Folder("My Documents");
        folder1.add(file1);
        folder1.add(file2);
        Link link1 = new Link("Shortcut to My Documents", folder1);

        // Создаем корневую папку и добавляем туда элементы
        Folder root = new Folder("Root");
        root.add(folder1);
        root.add(link1);
        root.add(new File("notes.txt", 800));

        // Визитер для сканирования вирусов
        VirusScanner virusScanner = new VirusScanner();
        System.out.println("=== Сканирование вирусов ===");
        root.accept(virusScanner);

        // Визитер для анализа размера
        SizeAnalyzer sizeAnalyzer = new SizeAnalyzer();
        System.out.println("\n=== Анализ размера файлов ===");
        root.accept(sizeAnalyzer);
        System.out.println("Общий размер файлов: " + sizeAnalyzer.getTotalSize() + " байт.");
    }
}
