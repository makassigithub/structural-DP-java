package org.makassi.decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeDescription() {
        return this.coffee.getCoffeeDescription() + " + milk";
    }

    @Override
    public double getCoffeePrice() {
        return this.coffee.getCoffeePrice() + 0.5;
    }
}
