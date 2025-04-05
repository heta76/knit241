package org.knit.solutions.lab2_4.task2_11;

public class MobileApp implements StockObserver {
    private final String userName;

    public MobileApp(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(Stock stock, double oldPrice, double newPrice) {
        System.out.println("MobileApp: Пользователь " + userName +
                " уведомлен об изменении цены акций " + stock.getCompanyName() +
                ": " + oldPrice + " -> " + newPrice);
    }
}
