package CollectionsInJava.Map;

import CollectionsInJava.Student;

import java.util.HashMap;
import java.util.Objects;

class Person{
    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int hashCode() {
      return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj){
           return true;
       }
       if(obj == null){
           return false;
       }
       if( getClass() != obj.getClass()){
           return false;
       }
       Person other = (Person) obj;
       return id == other.getId() && Objects.equals(name,other.getName());
    }
}
public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {

        Person p1 = new Person("ALice",101);
        Person p2 = new Person("Bob",102);
        Person p3 = new Person("ALice",101);

        HashMap<Person,String> map = new HashMap<>();
        map.put(p1,"Engineer");  //hashcode 1 --> index1
        map.put(p2,"Designer");  //hashcode 2 --> index2
        map.put(p3,"Manager");   //hashcode 1 --> index1 --> .equals() ---> replace


        System.out.println("HashMap size : " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: "+ map.get(p3));
    }
}
