package org.knit.solutions.lab2_5.task16;

import java.util.HashMap;
import java.util.Map;

// Фабрика приспособленцев, которая кэширует объекты символов
public class CharacterFactory {
    private Map<Character, Character2> cache = new HashMap<>();

    // Если символ с данным кодом уже существует, возвращаем его,
    // иначе создаем новый, сохраняем в кэше и возвращаем.
    public Character2 getCharacter(char code) {
        Character2 character = cache.get(code);
        if (character == null) {
            character = new ConcreteCharacter(code);
            cache.put(code, character);
        }
        return character;
    }
}
