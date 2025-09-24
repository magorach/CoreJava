package CoreJavaByDurgaSir.Objectclone;

class Student {
    int id;
    PermanentAddress address;


    //normal constructor
    public Student(int id, PermanentAddress address) {
        this.id = id;
        this.address = address;
    }

    //copy constructor
    public Student(Student other) {
        this.id = other.id;
        this.address = new PermanentAddress(other.address.city); // deep copy
//          this.address=other.address;  //shallow copy

    }

}

class PermanentAddress {

    String city;

    // normal constructor
    public PermanentAddress(String city) {
        this.city = city;
    }
}

public class copyConst {
    public static void main(String[] args) {

        Student s1 = new Student(101, new PermanentAddress("Delhi"));
        Student s2 = new Student(s1);
        s2.id = 102;
        s2.address.city = "Mumbai";
        System.out.println(s1.id + " and " + s1.address.city);
        System.out.println(s2.id + " and " + s2.address.city);
    }


}
