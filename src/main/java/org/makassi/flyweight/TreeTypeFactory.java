package org.makassi.flyweight;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TreeTypeFactory {
   private static final ConcurrentHashMap<String, TreeType> treeTypes = new ConcurrentHashMap<>();

    public static TreeType get(String name,String color, String texture) {
        return treeTypes.computeIfAbsent(name+"-"+color, k -> new TreeType(name, color, texture));
    }
}
