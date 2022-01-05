public class UsingInheritance {
    public static void main(String[] args) {

        Computer comp1 = new Computer("4 GB", "500 GB");

//        System.out.println(comp1.ram);

        System.out.println(comp1.getRam());

        comp1.setRam("8 GB");

        System.out.println(comp1.getRam());

        comp1.turnOn();


        Laptop lappy = new Laptop("10 GB", "256 GB", 6, "1080p");
        lappy.turnOn();

        String res = lappy.getResolution();
        System.out.println(res);

        System.out.println(lappy.getRam());
    }
}

class Computer{

    private String ram;
    private String storage;

    public String getRam(){
        return this.ram;
    }

    public void setRam(String ram){
        this.ram = ram;
    }



    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Computer(String ram, String storage) {
        this.ram = ram;
        this.storage = storage;
    }

    public void turnOn(){
        System.out.println("Computer is turning on...");
    }
}

class Laptop extends Computer{

    private int wifi_version;
    private String resolution;

    public Laptop(String ram, String storage, int wifi_version, String resolution) {
        super(ram, storage);
        this.wifi_version = wifi_version;
        this.resolution = resolution;

    }

    public int getWifi_version() {
        return wifi_version;
    }

    public void setWifi_version(int wifi_version) {
        this.wifi_version = wifi_version;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}