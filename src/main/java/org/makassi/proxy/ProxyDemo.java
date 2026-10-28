package org.makassi.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Displayable proxy = new DisplayProxy("my_movie.mp4");
        proxy.loadFromDisk();
        proxy.display();

        Displayable secondProxy = new DisplayProxy("my_movie.mp4");
        secondProxy.display();
    }
}
