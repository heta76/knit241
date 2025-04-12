package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab1.chainOfResponsibility.Main5;


/**
 Описание:
 Этот паттерн используется для передачи запроса по цепочке обработчиков, пока один из них не обработает его. Каждый обработчик в цепочке может либо обработать запрос, либо передать его дальше.

 Пример из жизни:
 Рассмотрим систему поддержки пользователей. Запрос от клиента сначала поступает к оператору первого уровня (обычный оператор), затем, если он не может решить проблему, передается специалисту второго уровня (инженеру), а если и он не справляется – ведущему инженеру.

 Задача:
 Реализуйте систему обработки жалоб клиентов в банке.

 Жалоба сначала поступает в колл-центр.
 Если проблема сложная, запрос передается менеджеру.
 Если даже менеджер не может решить проблему, запрос уходит в юридический отдел.
 Каждый уровень обработки либо решает проблему, либо передает ее дальше. (не менее 4х уровней поддержки)
 Представить проблему в виде объекта, с описанием, уровнем сложности.*/

@TaskDescription(taskNumber = 1, taskDescription = "Chain of Responsibility (Цепочка обязанностей)")
public class Task1 implements Solution {
    @Override
    public void execute() throws Exception {
        Main5.run();
    }
}
