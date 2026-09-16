package org.makassi.bridge;

public abstract class Device {
    private DeviceState deviceState = DeviceState.ON;
    public abstract  void increaseVolume();
    public abstract void decreaseVolume();

    public void toggleState() {
        deviceState = deviceState == DeviceState.ON ? DeviceState.OFF : DeviceState.ON;
    }

    public DeviceState getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(DeviceState deviceState) {
        this.deviceState = deviceState;
    }
}
