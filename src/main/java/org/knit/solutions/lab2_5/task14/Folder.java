package org.knit.solutions.lab2_5.task14;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemElement {
    private String name;
    private List<FileSystemElement> elements = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemElement element) {
        elements.add(element);
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        // Переходим ко всем вложенным элементам
        for (FileSystemElement element : elements) {
            element.accept(visitor);
        }
    }
}
