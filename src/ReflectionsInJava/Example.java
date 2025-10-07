package ReflectionsInJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.management.ClassLoadingMXBean;
import java.lang.reflect.Constructor;

public class Example {
    public static void main(String[] args) throws Exception  {

//        Samosa samosa1 = Samosa.getSamosa();
//        Samosa samosa1 = Samosa.INSTANCE;
//        System.out.println(samosa1.hashCode());
//        samosa1.test();
//        Samosa samosa2 = Samosa.INSTANCE;
//        System.out.println(samosa2.hashCode());

        //Breaking singleton pattern
        // 1) BY reflection API
        // 2) By serialization by and deserilization

        //Solution ->
        //1) if object is already there => throw exception from constructor
        //2) use enum
//        Constructor <Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa samosa2 = constructor.newInstance();
//        System.out.println(samosa2.hashCode());


        //Breaking singleton pattern
        // 2) By serialization by and deserilization
        //solution
        // by implementing readResolve method
//        Samosa samosa1 = Samosa.getSamosa();
//        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(samosa1);
//        System.out.println("Object is serialized");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa samosa2 = (Samosa) ois.readObject();
//        System.out.println("Object is deserialized");
//        System.out.println(samosa1.hashCode());
//        System.out.println(samosa2.hashCode());

        // Breaking
        // 3) By cloning
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = (Samosa) samosa1.clone();
        System.out.println(samosa2.hashCode());


    }
}
