package org.knit.solutions.lab2_6;

import java.util.Random;

public class MontyHallSimulation {
    public static void Run() {
        long trials = 1_000_000;
        long stayWins = 0;
        long switchWins = 0;
        Random rand = new Random();

        for (long i = 0; i < trials; i++) {
            // Загадываем приз за одной из трёх дверей
            int prizeDoor = rand.nextInt(3);
            // Игрок делает первоначальный выбор
            int playerChoice = rand.nextInt(3);

            // Ведущий открывает одну из оставшихся дверей без приза и не выбранную игроком
            int hostOpens;
            do {
                hostOpens = rand.nextInt(3);
            } while (hostOpens == prizeDoor || hostOpens == playerChoice);

            // Определяем оставшуюся закрытую дверь
            int remainingDoor = 3 - playerChoice - hostOpens;

            // Если игрок остаётся при своём выборе
            if (playerChoice == prizeDoor) {
                stayWins++;
            }
            // Если игрок переключается на remainingDoor
            if (remainingDoor == prizeDoor) {
                switchWins++;
            }
        }

        double stayWinRate = stayWins * 100.0 / trials;
        double switchWinRate = switchWins * 100.0 / trials;

        System.out.printf("Всего испытаний: %,d%n", trials);
        System.out.printf("Выигрышей при сохранении выбора: %,d (%.2f%%)%n", stayWins, stayWinRate);
        System.out.printf("Выигрышей при смене выбора:    %,d (%.2f%%)%n", switchWins, switchWinRate);
    }
}

