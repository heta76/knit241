package org.knit.solutions.lab1.decorator;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Оборачиваемый объект

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public double getCalories() {
        return coffee.getCalories();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
