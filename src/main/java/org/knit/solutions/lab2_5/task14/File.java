package org.knit.solutions.lab2_5.task14;

public class File implements FileSystemElement {

    private String name;
    private int size; // размер файла в байтах

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
