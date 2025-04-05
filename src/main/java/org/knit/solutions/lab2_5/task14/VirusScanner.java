package org.knit.solutions.lab2_5.task14;

import java.util.Random;

// Визитер для сканирования вирусов
public class VirusScanner implements Visitor {
    private Random random = new Random();
    @Override
    public void visit(File file) {
        System.out.println("Сканирую файл: " + file.getName() + " на вирусы...");
        // С вероятностью 10% обнаруживается вирус
        if (random.nextInt(5) == 0) {  // 0..9 → 10%
            System.out.println("⚠️ Вирус обнаружен в файле: " + file.getName() + "!");
        } else {
            System.out.println("✅ Файл " + file.getName() + " безопасен.");
        }
    }

    @Override
    public void visit(Folder folder) {
        System.out.println("Сканирую папку: " + folder.getName() + " на вирусы.");
    }

    @Override
    public void visit(Link link) {
        System.out.println("Сканирую ссылку: " + link.getName() + " на вирусы.");
    }
}
