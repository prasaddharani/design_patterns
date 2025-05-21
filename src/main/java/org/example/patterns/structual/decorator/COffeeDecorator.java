package org.example.patterns.structual.decorator;

public abstract class COffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public COffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
