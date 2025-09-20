package CoreJavaByDurgaSir.Video6;

import java.util.Date;

//How to make class immutable
final class Employee {

    private final String name;
    private final Date joiningDate;


    Employee(String name, Date joiningDate) {
        this.name = name;
//        this.joiningDate = joiningDate;   //--------? ---> mutable
        this.joiningDate = new Date(joiningDate.getTime());   // ✅ defensive copy in constructor
    }

    public String getName() {
        return name;
    }

    public Date getJoiningDate() {
       // return joiningDate;  //--------? ---> mutable
        return new Date(joiningDate.getTime());  // ✅ defensive copy in getter
    }
}
