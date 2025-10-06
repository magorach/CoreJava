package CoreJavaByDurgaSir.TypesOfInnerClasses;

public class Computer {


    //static inner class
    private String brand;
    private String model;

    private OperatingSystem os;

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    public OperatingSystem getOs() {
        return os;
    }

    static  class USB{
        private String type;

        public USB(String type) {
            this.type = type;
        }
        public  void displayInfo(){
            System.out.println("USB type:"+ type);
        }

    }
    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer model" + model + ", Os: "+ os);
        }
    }

}