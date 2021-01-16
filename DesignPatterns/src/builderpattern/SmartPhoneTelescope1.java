public class SmartPhoneTelescope1 {

    private String model;
    private int memoryCapacity;
    private Boolean is4G;
    private int batteryCapacity;

    public SmartPhoneTelescope1(String model) {
        this.model = model;
    }

    public SmartPhoneTelescope1(String model, int memoryCapacity) {
        this(model);
        this.memoryCapacity = memoryCapacity;
    }

    public SmartPhoneTelescope1(String model, int memoryCapacity, Boolean is4G) {
        this(model, memoryCapacity);
        this.is4G = is4G;
    }

    public SmartPhoneTelescope1(String model, int memoryCapacity, Boolean is4G, int batteryCapacity) {
        this(model, memoryCapacity, is4G);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "SmartPhoneTelescope1{" +
                "model='" + model + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                ", is4G=" + is4G +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
