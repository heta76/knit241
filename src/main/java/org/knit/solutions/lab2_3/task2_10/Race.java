package org.knit.solutions.lab2_3.task2_10;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Задача 10: Гонка бегунов с использованием CyclicBarrier 🏃‍♂️🏃‍♀️
public class Race {
    public static void main(String[] args) {
        final int numRunners = 5;

        CyclicBarrier barrier = new CyclicBarrier(numRunners, () ->
                System.out.println("Все бегуны на старте! Гонка началась!"));

        ExecutorService executor = Executors.newFixedThreadPool(numRunners);

        for (int i = 1; i <= numRunners; i++) {
            executor.execute(new Runner(barrier, i));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
            System.out.println("Гонка завершена!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
