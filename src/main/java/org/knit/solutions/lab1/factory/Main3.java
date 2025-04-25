package org.knit.solutions.lab1.factory;

public class Main3 {
    public static void run() throws Exception {
        TransportFactory transportFactory = new TransportFactory();
        try {
            Transport transport1 = transportFactory.createTransport("business");
            System.out.println(transport1.getSpetifications());
        } catch (Exception e) {
            System.out.println("Неверный тип поездки");
        }
    }
}
