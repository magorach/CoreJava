package CollectionsInJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie",3.5));
        students.add(new Student("Bob",3.7));
        students.add(new Student("ALice",3.5));
        students.add(new Student("Akshit",3.9));

        students.sort((s1,s2)-> {
            if (s2.getGpa() -s1.getGpa() >0){
                return 1;
            }else if (s2.getGpa() - s1.getGpa() <0){
                return -1;
            }
            else return s1.getName().compareTo(s2.getName());   //compareTo --> string ka method h
        });
        for (Student s : students){
            System.out.println(s.getName()+": "+ s.getGpa());
        }
        System.out.println("using method reference");
//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//        students.sort(comparator);
//        for (Student s : students){
//            System.out.println(s.getName()+": "+ s.getGpa());
//        }
    }
}
