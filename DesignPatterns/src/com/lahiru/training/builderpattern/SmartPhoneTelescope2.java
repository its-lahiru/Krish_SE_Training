package com.lahiru.training.builderpattern;

public class SmartPhoneTelescope2 {

    private String model;
    private int memoryCapacity;
    private Boolean is4G;
    private int batteryCapacity;

    public SmartPhoneTelescope2(String model, int memoryCapacity, Boolean is4G, int batteryCapacity) {
        this.model = model;
        this.memoryCapacity = memoryCapacity;
        this.is4G = is4G;
        this.batteryCapacity = batteryCapacity;
    }

    public SmartPhoneTelescope2(String model, int memoryCapacity, Boolean is4G) {
        this(model, memoryCapacity, is4G, 0);
    }

    public SmartPhoneTelescope2(String model, int memoryCapacity) {
        this(model, memoryCapacity, null, 0);
    }

    public SmartPhoneTelescope2(String model) {
        this(model, 0, null, 0);
    }

    @Override
    public String toString() {
        return "SmartPhoneTelescope2{" +
                "model='" + model + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                ", is4G=" + is4G +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
