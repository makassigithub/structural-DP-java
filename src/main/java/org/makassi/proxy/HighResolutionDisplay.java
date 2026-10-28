package org.makassi.proxy;

// The Real Service object that can be heavy to deal with and the is proxied
public class HighResolutionDisplay implements Displayable{
    private final String fileName;

    public HighResolutionDisplay(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void loadFromDisk() {
        System.out.println("System is Loading " + fileName + " from disk");
    }

    @Override
    public void display() {
        System.out.println("System is Displaying " + fileName);
    }
}
