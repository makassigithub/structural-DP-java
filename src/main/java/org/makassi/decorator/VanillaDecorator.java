package org.makassi.decorator;

public class VanillaDecorator extends CoffeeDecorator {
    public VanillaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeDescription() {
        return this.coffee.getCoffeeDescription() + " + vanilla";
    }

    @Override
    public double getCoffeePrice() {
        return this.coffee.getCoffeePrice() + 0.1;
    }
}
