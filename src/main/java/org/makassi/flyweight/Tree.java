package org.makassi.flyweight;

public class Tree {
    int x;
    int y;
    TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    void display(Canvas canvas){
        type.display(canvas, x, y);
    }
}
