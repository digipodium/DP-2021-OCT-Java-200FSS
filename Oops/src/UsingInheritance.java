public class UsingInheritance {
    public static void main(String[] args) {

        Computer comp1 = new Computer("4 GB", "500 GB");

//        System.out.println(comp1.ram);

        System.out.println(comp1.getRam());

        comp1.setRam("8 GB");

        System.out.println(comp1.getRam());

        comp1.turnOn();


        Laptop lappy = new Laptop("10 GB", "256 GB", 6, "1080p");

        String res = lappy.getResolution();
        System.out.println(res);

        System.out.println(lappy.getRam());

        lappy.turnOn();

        Laptop lappy2 = new Laptop("16 GB", "500 GB");
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

    public Laptop(String ram, String storage) {
        super(ram, storage);
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

    public void turnOn(){
        System.out.println("Laptop is turning on...");
    }
}


class GamingLaptop extends Laptop {

    private String graphic_card;
    private boolean backlit_keys;


    public GamingLaptop(String ram, String storage, int wifi_version, String resolution) {
        super(ram, storage, wifi_version, resolution);
    }

    public GamingLaptop(String ram, String storage) {
        super(ram, storage);
    }
}

class Notebook extends Laptop {

    private boolean convertible;
    private boolean touch_screen;


    public Notebook(String ram, String storage, int wifi_version, String resolution) {
        super(ram, storage, wifi_version, resolution);
    }

    public Notebook(String ram, String storage) {
        super(ram, storage);
    }
}

//class HybridLaptop extends GamingLaptop extends Notebook{
//
//}