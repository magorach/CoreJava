package SerializationConcept;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {

        ExternalizationDemo externalizationDemo = new ExternalizationDemo("durga",10,20);
        FileOutputStream fos = new FileOutputStream("abc.rer");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(externalizationDemo);
        System.out.println(" Object is serialized");

        FileInputStream fis = new FileInputStream("abc.rer");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizationDemo  obj = (ExternalizationDemo) ois.readObject();
        System.out.println(obj.getS());
        System.out.println(obj.getI());
        System.out.println(obj.getJ());


    }

}
