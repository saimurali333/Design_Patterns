package BuilderPattern;

public class Phone {
    private String phoneType;
    private String os;
    private int ram;
    private String model;
    private int battery;

    private Phone(PhoneBuilder phoneBuilder) {
        this.phoneType = phoneBuilder.getPhoneType();
        this.os = phoneBuilder.getOs();
        this.ram = phoneBuilder.getRam();
        this.model = phoneBuilder.getModel();
        this.battery = phoneBuilder.getBattery();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneType='" + phoneType + '\'' +
                ", os='" + os + '\'' +
                ", ram=" + ram +
                ", model='" + model + '\'' +
                ", battery=" + battery +
                '}';
    }

    public class PhoneBuilder {
        private String phoneType;
        private String os;
        private int ram;
        private String model;
        private int battery;

        public String getPhoneType() {
            return phoneType;
        }

        public PhoneBuilder setPhoneType(String phoneType) {
            this.phoneType = phoneType;
            return this;
        }

        public String getOs() {
            return os;
        }

        public PhoneBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public int getRam() {
            return ram;
        }

        public PhoneBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public String getModel() {
            return model;
        }

        public PhoneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public int getBattery() {
            return battery;
        }

        public PhoneBuilder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
