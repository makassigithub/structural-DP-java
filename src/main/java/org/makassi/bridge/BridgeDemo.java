package org.makassi.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Device TvDevice = new Tv();
        Device RadioDevice = new Radio();

        RemoteControl tvControl = new RemoteControl(TvDevice);
        RemoteControl radioControl = new RemoteControl(RadioDevice);

        // Getting initial state for devices
        System.out.println(tvControl.getDeviceState());
        System.out.println(radioControl.getDeviceState());

        // Increasing volume through remote
        tvControl.increaseVolume();
        radioControl.increaseVolume();

        // Decreasing volume through remote
        tvControl.decreaseVolume();
        radioControl.decreaseVolume();

        // Toggling device through remote
        tvControl.toggleState();
        radioControl.toggleState();

        System.out.println(tvControl.getDeviceState());
        System.out.println(radioControl.getDeviceState());
    }
}
