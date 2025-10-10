package Aggregation;

public class Car {

    private Engine engine;

    Car (Engine engine){
        this.engine = engine;
    }

    void startCar(){
        engine.start();
        System.out.println("Car is now running");
    }
    void setEngine(Engine engine){
        this.engine = engine;
    }

}
