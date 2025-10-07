package SerializationConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {
    public static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("ob.txt");
            ObjectInputStream oos = new ObjectInputStream(fis);
            Student s1 = (Student) oos.readObject();
            fis.close();
            oos.close();
            System.out.println("Object recovered successfully ");
            s1.displayName();
            System.out.println(s1.getEmail());
//            System.out.println(s1.getName()+" "+s1.getEmail()+" "+ s1.getAge()+" "+ s1.getAddress());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
