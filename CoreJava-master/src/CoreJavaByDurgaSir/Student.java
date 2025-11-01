package CoreJavaByDurgaSir; // video 1 & 2 & 3

import java.util.ArrayList;
import java.util.Objects;

public class Student {

    String name;
    int rollno;

//    @Override
//    public int hashCode() {
//        return rollno;
//    }

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", rollno=" + rollno +
//                '}';
//    }


//    @Override
//    public boolean equals(Object o) {
//        if(this == o){
//            return true;
//        }
//        if (!(o instanceof Student student)) return false;
//        return rollno == student.rollno && Objects.equals(name, student.name);
//    }

    //--> recommended--> Check same reference quickly, handle null safely and Objects.equals() → avoids NullPointerException when name is null

    @Override
    public boolean equals(Object obj){
           if ( this == obj){
               return true;
           }
        try {
            String name1 = this.name;
            int rollno1 = this.rollno;
            Student s = (Student) obj;
            String name2 = s.name;
            int rollno2 = s.rollno;
            if (name1.equals(name2) && rollno1 == rollno2) return true;
            else return false;
        }
        catch (ClassCastException | NullPointerException e){
            return false;
        }
    }
    //---------> manual -> 1)No type check → if obj is not a Student, you’ll get a ClassCastException
    //                     2) NO null check





//    @Override
//    public int hashCode() {
//        return Objects.hash(name, rollno);
//    }

    public static void main(String[] args) {

//        Student s1 = new Student("Rachit",101);
//        Student s2 = new Student("Sumit",102);
//        Student s3 = new Student("Rachit",101);
//        Student s4 =s1;
//        System.out.println(s1.equals(s2));  //false
//        System.out.println(s1.equals(s3));  //false -----> object's class equals method run by default but true when we override the method then it compares content
//        System.out.println(s1.equals(s4)); // true
//        System.out.println(s1.equals("Rachit"));  //false
//        System.out.println(s2.equals(null)); //false

        String s1 = "Durga";
        String s2 = new String("Durga");
        System.out.println(s1.equals(s2));




//
//        System.out.println(s1);
//        System.out.println(s2);
//
//        String s = new String("Durga");
//        System.out.println(s);
//
//
//        ArrayList<Integer> ll = new ArrayList<>();
//        ll.add(10);
//        ll.add(20);
//        System.out.println(ll);

    }
}
