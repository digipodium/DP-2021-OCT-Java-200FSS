public class UsingAbstractClasses {

    public static void main(String[] args) {

//        Phone ph = new Phone();
            SmartPhone myphone = new SmartPhone("1080p", "48MP", "4GB", "5G", "Samsung");
            Phone myphone2 = new SmartPhone("1080p", "64MP", "6GB", "5G", "OnePlus");
    }

}


abstract class Phone{

    private String type;
    private String brand;

    public Phone(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    abstract void switchOn();

    void normalMethod(){

    }

}

class SmartPhone extends Phone{

    private String resolution;
    private String camera;
    private String ram;

    public SmartPhone(String resolution, String camera, String ram, String type, String brand) {
        super(type, brand);
        this.resolution = resolution;
        this.camera = camera;
        this.ram = ram;
    }

    void switchOn(){
        System.out.println("Phone is switching");
    }


}