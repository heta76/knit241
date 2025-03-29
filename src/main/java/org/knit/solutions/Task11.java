package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_4.task2_11.EmailNotifier;
import org.knit.solutions.lab2_4.task2_11.MobileApp;
import org.knit.solutions.lab2_4.task2_11.Stock;
import org.knit.solutions.lab2_4.task2_11.StockObserver;

/**
 * Задача 11: Реализация системы уведомлений в биржевом приложении
 *
 * Вы разрабатываете приложение для биржевой торговли, где пользователи могут подписываться на обновления акций определённых компаний.
 *
 * Требуется:
 *
 * Создать класс Stock (акция), который хранит информацию о текущей цене и может уведомлять подписчиков об изменении цены.
 * Создать интерфейс StockObserver и реализовать его в классах MobileApp и EmailNotifier, которые получают уведомления при изменении цены.
 * Реализовать механизм подписки и отписки для StockObserver.
 * Пример работы:
 *
 * Пользователь подписывается на акции компании "Tesla".
 * Когда цена акции изменяется, приложение отправляет уведомления подписчикам.
 * Если пользователь отписался, он больше не получает уведомления.
 * Дополнительно: Добавьте возможность подписки на акции нескольких компаний.
 */

@TaskDescription(taskNumber = 11, taskDescription = "Паттерн Observer (Наблюдатель)")
public class Task11 implements Solution {
    @Override
    public void execute() {
        Stock teslaStock = new Stock("Tesla", 700.0);

        // Создаем наблюдателей
        StockObserver mobileUser = new MobileApp("Ivan");
        StockObserver emailUser = new EmailNotifier("egor@example.com");

        // Подписываем пользователей на уведомления об изменении цены акций Tesla
        teslaStock.subscribe(mobileUser);
        teslaStock.subscribe(emailUser);

        // Изменение цены акции - уведомление всех подписчиков
        System.out.println("Изменение цены акции Tesla:");
        teslaStock.setPrice(710.0);

        // Отписываем одного из наблюдателей
        teslaStock.unsubscribe(mobileUser);

        // Следующее изменение цены - уведомляется только оставшийся подписчик
        System.out.println("\nИзменение цены акции Tesla после отписки MobileApp:");
        teslaStock.setPrice(720.0);
    }
}