package org.makassi.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeDescription() {
        return this.coffee.getCoffeeDescription() + " + sugar";
    }

    @Override
    public double getCoffeePrice() {
        return this.coffee.getCoffeePrice() + 0.20;
    }
}
