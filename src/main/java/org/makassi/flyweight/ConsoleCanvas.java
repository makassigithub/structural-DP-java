package org.makassi.flyweight;

public class ConsoleCanvas implements Canvas{
    @Override
    public void draw(String texture, int x, int y) {
        System.out.println("Drawing " + texture + " at (" + x + "," + y +")");
    }
}
