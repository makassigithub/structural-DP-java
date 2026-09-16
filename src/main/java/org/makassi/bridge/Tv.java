package org.makassi.bridge;

public class Tv extends Device {
    @Override
    public void increaseVolume() {
        System.out.println( this.getClass().getName() + "Volume +");
    }

    @Override
    public void decreaseVolume() {
        System.out.println( this.getClass().getName() + "Volume -");
    }
}
