package org.knit.solutions.lab2_2.task2_4;

public class Main2 {
    public static void run() {
        GazStation gazStation = new GazStation(2);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                gazStation.Refuel(finalI + " машина");
            }).start();
            }
    }
}
