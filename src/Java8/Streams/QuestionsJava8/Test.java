package Java8.Streams.QuestionsJava8;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<Student> studentsList = Arrays.asList(
                new Student(1, "Rohit", 30, "Male", "Mechanical", "Mumbai", 122, Arrays.asList("+917515545543", "+917548263140")),
                new Student(2, "Priya", 25, "Female", "Computer Science", "Pune", 67, Arrays.asList("+919812345678", "+919876543210")),
                new Student(3, "Amit", 28, "Male", "Electrical", "Delhi", 164, Arrays.asList("+918888999900", "+919999888877")),
                new Student(4, "Sneha", 26, "Female", "Civil", "Bangalore", 26, Arrays.asList("+917045612378", "+917045612379")),
                new Student(5, "Vikram", 27, "Male", "Electronics", "Chennai", 12, Arrays.asList("+917234567890", "+919834567890")),
                new Student(6, "Neha", 24, "Female", "Information Technology", "Hyderabad", 90, Arrays.asList("+919121212121", "+919131313131")),
                new Student(7, "Arjun", 29, "Male", "Mechanical", "Mumbai", 324, Arrays.asList("+919876123456", "+917856341200")),
                new Student(8, "Kavya", 23, "Female", "Computer Science", "Pune", 433, Arrays.asList("+918234567890", "+917654321234")),
                new Student(9, "Rahul", 31, "Male", "Civil", "Delhi", 7, Arrays.asList("+918765432109", "+917812345678")),
                new Student(10, "Meera", 27, "Female", "Electrical", "Bangalore", 98, Arrays.asList("+919595959595", "+919393939393"))
        );

        Map<Integer, List<Student>> collect = studentsList.stream().collect(Collectors.groupingBy(Student::getRank));
        collect.values().forEach((list)->{
            System.out.println(list.stream().filter(s-> s.getRank()).map(Student::getFirstName).toList());
        });

//        Map<Integer, List<Student>> filteredByRank = studentsList.stream()
//                .filter(s -> s.getRank() < 50)
//                .collect(Collectors.groupingBy(Student::getRank));

//      collect.forEach((id,list)->{
//            System.out.println(id+ " -> "+ list.stream().map(Student::getFirstName));
//        });
        System.out.println(collect);

    }
}
