package org.knit.solutions.lab2_5.task14;

// Визитер для анализа общего размера файлов
public class SizeAnalyzer implements Visitor {
    private int totalSize = 0;

    public int getTotalSize() {
        return totalSize;
    }

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Folder folder) {
        // Для папок размер не считается, но их содержимое будет обработано через accept()
    }

    @Override
    public void visit(Link link) {
        // Ссылки не учитываются в размере
    }
}
