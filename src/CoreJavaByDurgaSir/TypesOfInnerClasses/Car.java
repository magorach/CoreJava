package CoreJavaByDurgaSir.TypesOfInnerClasses;

public class Car {



    //member inner class
    private String model;
    private boolean isEngineON;

    public Car(String model){
        this.model = model;
        this.isEngineON =false;
    }

    class Engine {
        void start(){
            if (!isEngineON){
                isEngineON = true;
                System.out.println( model + "engine started");
            }else {
                System.out.println( model + "engine already started");
            }
        }
        void stop(){
            if (isEngineON){
                isEngineON = false;
                System.out.println( model + "engine stopped");
            }else {
                System.out.println( model + "engine already stopped");
            }
        }
    }
}
