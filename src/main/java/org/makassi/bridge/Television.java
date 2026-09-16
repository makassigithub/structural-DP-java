package org.makassi.bridge;

public class Television extends Device {
    @Override
    public void increaseVolume() {
        System.out.println(this.getClass().getSimpleName() + " Volume +");
    }

    @Override
    public void decreaseVolume() {
        System.out.println(this.getClass().getSimpleName() + " Volume -");
    }
}
