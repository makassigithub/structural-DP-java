package org.makassi.flyweight;

public class TreeType {
    String name;
    String color;
    String texture;

    TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    void display(Canvas canvas, int x, int y) {
        canvas.draw(this.texture, x, y);
    }
}
