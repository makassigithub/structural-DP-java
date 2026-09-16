package org.makassi.bridge;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println(device.getClass().getSimpleName() + " muted");
        device.decreaseVolume();
    }
}
