package SerializationConcept;

import java.io.*;

class Dog implements Serializable {
    int i = 10;
    int j = 20;

}
public class SerializedDemo {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog();

        //serialization
        FileOutputStream fos = new FileOutputStream("ABC.ser");
        ObjectOutputStream oos =new ObjectOutputStream(fos);
        oos.writeObject(d1);

        //deserialization
        FileInputStream fis = new FileInputStream("ABC.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog) ois.readObject();
        System.out.println(d2.i + " and "+ d2.j) ;
    }
}
