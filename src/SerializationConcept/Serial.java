package SerializationConcept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        try{
            Student student = new Student("Rachit", "rachitmago234@gmail.com", 25, "Delhi");

            FileOutputStream fos  = new FileOutputStream("ob.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);

            oos.close();
            fos.close();
            System.out.println("Object state is transferred to ob !!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
