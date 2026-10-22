package org.makassi.decorator;

import java.sql.SQLOutput;

public class DecoratorDemo {
    public static void main(String[] args) {
    Coffee coffee = new SimpleCoffee();
           coffee = new SugarDecorator(coffee);
           coffee = new MilkDecorator(coffee);
           coffee = new VanillaDecorator(coffee);
        System.out.println(coffee.getCoffeeDescription());
        System.out.println(String.format("%.2f",coffee.getCoffeePrice())+ "$");
        System.out.printf("%.2f",coffee.getCoffeePrice());
        System.out.print("$");
    }
}
