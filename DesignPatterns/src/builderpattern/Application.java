public class Application {

    public static void main(String[] args) {

        SmartPhoneTelescope1 smartPhoneTelescope1 = new SmartPhoneTelescope1("IS-3");
        System.out.println(smartPhoneTelescope1);

        SmartPhoneTelescope2 smartPhoneTelescope2 = new SmartPhoneTelescope2("IS-7");
        System.out.println(smartPhoneTelescope2);

        SmartPhone.Builder builder = new SmartPhone.Builder("KV-2");
        SmartPhone smartPhone = builder.memoryCapacity(64).is4G(Boolean.TRUE).batteryCapacity(5000).build();
        System.out.println(smartPhone);

    }

}
