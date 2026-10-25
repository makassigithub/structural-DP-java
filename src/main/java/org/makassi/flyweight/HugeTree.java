package org.makassi.flyweight;

public class HugeTree {
    int x;
    int y;
    String color;
    String name;
    byte [] texture; // this could be huge and raise memory problem

    public HugeTree(int x, byte[] texture, String name, int y, String color) {
        this.x = x;
        this.texture = texture;
        this.name = name;
        this.y = y;
        this.color = color;
    }
}
