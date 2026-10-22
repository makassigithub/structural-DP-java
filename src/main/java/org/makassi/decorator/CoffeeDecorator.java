package org.makassi.decorator;

public abstract class CoffeeDecorator implements Coffee {

    protected final Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
