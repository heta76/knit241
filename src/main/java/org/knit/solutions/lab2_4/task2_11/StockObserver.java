package org.knit.solutions.lab2_4.task2_11;

public interface StockObserver {
    void update(Stock stock, double oldPrice, double newPrice);
}
