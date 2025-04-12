package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab1.decorator.Main4;


/**
 Описание:
 Декоратор позволяет динамически добавлять новую функциональность объектам без изменения их кода. Это достигается путем обертывания объектов в дополнительные классы.

 Пример из жизни:
 Рассмотрим кофейню, где клиент может заказывать кофе с различными добавками. Вместо создания отдельных классов для каждого вида кофе, можно использовать декораторы:

 Основной кофе
 Декораторы: сахар, молоко, карамель и т. д.
 Задача:
 Реализуйте систему онлайн-заказов кофе.

 У вас есть базовый класс Coffee, который имеет метод getCost() и getDescription().
 Напишите декораторы для добавления различных ингредиентов (молоко, карамель, шоколад).
 Каждый декоратор изменяет стоимость и описание кофе.
 Расширьте решение, добавив калорийность и разные виды напитков*/

@TaskDescription(taskNumber = 2, taskDescription = "Decorator (Декоратор)")
public class Task2 implements Solution {
    @Override
    public void execute() throws Exception {
        Main4.run();
    }
}