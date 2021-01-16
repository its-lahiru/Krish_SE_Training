public class SmartPhone {

    private final String model;
    private final int memoryCapacity;
    private final Boolean is4G;
    private final int batteryCapacity;

    public SmartPhone(Builder builder) {
        this.model = builder.model;
        this.memoryCapacity = builder.memoryCapacity;
        this.is4G = builder.is4G;
        this.batteryCapacity = builder.batteryCapacity;
    }

    static class Builder {

        private String model;
        private int memoryCapacity;
        private Boolean is4G;
        private int batteryCapacity;

        public SmartPhone build(){
            return new SmartPhone(this);
        }

        // every smartphone has a model number. So, model is put inside default constructor
        // otherwise another method can be created for model
        public Builder(String model) {
            this.model = model;
        }

        // It is looks like a constructor but it is not.
        // It is looks like a setter but it is not
        public Builder memoryCapacity(int memoryCapacity){
            this.memoryCapacity = memoryCapacity;
            //return current instance
            return this;
        }

        public Builder is4G(Boolean is4G){
            this.is4G = is4G;
            //return current instance
            return this;
        }

        public Builder batteryCapacity(int batteryCapacity){
            this.batteryCapacity = batteryCapacity;
            //return current instance
            return this;
        }
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "model='" + model + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                ", is4G=" + is4G +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
