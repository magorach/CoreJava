package CollectionsInJava;

import java.util.Comparator;

public class Student implements Comparable<Student>{

    private String name;

    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }


    // 4  3 --> sort higher cgpa to lower
    // 4.compareTo(3)    4 comes before 3 -- > it should return negative
    @Override
    public int compareTo(Student student) {
      return  Double.compare(student.getGpa(),this.getGpa());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
