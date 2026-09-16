package org.makassi.bridge;

public class RemoteControl {
    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void increaseVolume() {
        device.increaseVolume();
    }

    public void decreaseVolume() {
        device.decreaseVolume();
    }

    public void toggleState() {
        device.toggleState();
    }

    public DeviceState getDeviceState() {
        return device.getDeviceState();
    }
}
