package org.knit.solutions.lab2_4.task2_11;

public class EmailNotifier implements StockObserver {
    private String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void update(Stock stock, double oldPrice, double newPrice) {
        System.out.println("EmailNotifier: Отправлено письмо на " + email +
                " с информацией, что цена акций " + stock.getCompanyName() +
                " изменилась с " + oldPrice + " до " + newPrice);
    }
}
