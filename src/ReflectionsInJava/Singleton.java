package ReflectionsInJava;

public class Singleton {

    //eager initialization
    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}

//lazy initialization
class LazySingleton{

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}