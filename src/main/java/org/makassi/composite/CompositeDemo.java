package org.makassi.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Folder parentFolder = new Folder("Parent Music");
        File file_1 = new File("file_1.mp3", 1024);
        File file_2 = new File("file_2.mp3", 1024);

        Folder childFolder = new Folder("Child Music");
        File file_3 = new File("file_3.mp3", 1024);
        File file_4 = new File("file_4.mp3", 1024);

        childFolder.addChild(file_3);
        childFolder.addChild(file_4);

        parentFolder.addChild(file_1);
        parentFolder.addChild(file_2);
        parentFolder.addChild(childFolder);

        parentFolder.display();

    }
}
