package org.makassi.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Device tvDevice = new Television();
        Device radioDevice = new Radio();

        RemoteControl tvControl = new RemoteControl(tvDevice);
        RemoteControl radioControl = new RemoteControl(radioDevice);

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

        // RefinedAbstraction: extra behavior on top of the same Device implementors
        AdvancedRemoteControl advancedTvControl = new AdvancedRemoteControl(tvDevice);
        advancedTvControl.mute();
    }
}
