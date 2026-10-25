package org.makassi.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Canvas canvas = new ConsoleCanvas();
        List<Tree> forest = new ArrayList<>();

        for(int i=0; i<1_000_000; i++){
            TreeType treeType = (i % 2 == 0) ?
                    TreeTypeFactory.get("Oak", "Green", "oak.png"):
                    TreeTypeFactory.get("Pin", "yellow", "pin.png");
            forest.add(new Tree(random.nextInt(1000), random.nextInt(1000), treeType));
        }

        forest.subList(0,5).forEach(t-> t.display(canvas));
    }
}
