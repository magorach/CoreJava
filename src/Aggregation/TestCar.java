package Aggregation;

public class TestCar {
    public static void main(String[] args) {
        Engine petrol = new PetrolEngine();
        Car car1 = new Car(petrol);
        car1.startCar();
        System.out.println("Engine switching");
        Engine eEngine = new ElectricEngine();
        car1.setEngine(eEngine);  // changing component dynamically
        car1.startCar();
    }
}
