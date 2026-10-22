package org.makassi.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String getCoffeeDescription() {
        return "Simple Coffee ";
    }

    @Override
    public double getCoffeePrice() {
        return 2.00;
    }
}
