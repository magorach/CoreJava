package CoreJavaByDurgaSir.Video6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test {
    public static void main(String[] args) {
//        Date d1 = new Date(); // today's date
//        Employee e1 = new Employee("Rachit", d1);
//        System.out.println(e1.getJoiningDate());
//
//        d1.setTime(0);
//        System.out.println(e1.getJoiningDate());

        List<String> skillSet = new ArrayList<>();
        skillSet.add("Java");
        Customer c1 = new Customer("Rachit",skillSet);
        System.out.println(c1.getSkills());
        skillSet.add("SpringBoot");
        System.out.println(c1.getSkills());

        // Try modifying via getter
        List<String> exposed = c1.getSkills();
        try {
            exposed.add("Hibernate"); // throws UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Modification attempt failed! ✅");
        }

    }
}
