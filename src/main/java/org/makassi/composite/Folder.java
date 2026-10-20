package org.makassi.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Storable {
    private final List<Storable> children = new ArrayList<>();
    public Folder(String name) {
        super(name);
        this.setType("folder");
    }

    public Folder(String name, int size) {
        super(name,size);
    }

    public List<Storable> getChildren() {
        return children;
    }

    public void addChild(Storable child) {
        this.children.add(child);
    }

    public void removeChild(Storable child) {
        this.children.remove(child);
    }

    @Override
    protected void display() {

        int size = this.getChildren().stream().mapToInt(Storable::getSize).sum();

        System.out.println(this.getType()+ "--" + this.getName() + "(" + size + "kb)" );
        for (Storable child : this.children) {
            child.display();
        }
    }
}
