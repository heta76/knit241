package org.knit.solutions.lab2_5.task16;

// Реализация символа, содержащая внутреннее состояние (код символа)
public class ConcreteCharacter implements Character2 {
    private char code; // Внутреннее состояние

    public ConcreteCharacter(char code) {
        this.code = code;
    }

    @Override
    public void render(int x, int y, String style) {
        // Внешнее состояние (x, y, style) передается в метод render()
        System.out.println("Отображение символа '" + code + "' на координатах (" + x + ", " + y + ") со стилем: " + style);
    }
}
