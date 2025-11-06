package Java8.Streams.QuestionsJava8;

import javax.crypto.spec.PSource;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<Student> studentsList = Arrays.asList(
                new Student(1, "Rohit", 30, "Male", "Mechanical", "Delhi", 122, Arrays.asList("+917515545543", "+917548263140")),
                new Student(2, "Priya", 25, "Female", "Computer Science", "Pune", 67, Arrays.asList("+919812345678", "+919876543210")),
                new Student(3, "Amit", 28, "Male", "Electrical", "Delhi", 164, Arrays.asList("+918888999900", "+919999888877")),
                new Student(4, "Sneha", 26, "Female", "Civil", "Bangalore", 26, Arrays.asList("+917045612378", "+917045612379")),
                new Student(5, "Vikram", 27, "Male", "Electronics", "Chennai", 12, Arrays.asList("+917234567890", "+919834567890")),
                new Student(6, "Neha", 24, "Female", "Information Technology", "Hyderabad", 90, Arrays.asList("+919121212121", "+919131313131")),
                new Student(7, "Arjun", 29, "Male", "Mechanical", "Mumbai", 324, Arrays.asList("+919876123456", "+917856341200")),
                new Student(8, "Kavya", 23, "Female", "Computer Science", "Pune", 433, Arrays.asList("+918234567890", "+917654321234")),
                new Student(9, "Rahul", 31, "Male", "Mechanical", "Delhi", 7, Arrays.asList("+918765432109", "+917812345678")),
                new Student(10, "Meera", 27, "Female", "Electrical", "Bangalore", 98, Arrays.asList("+919595959595", "+919393939393"))
        );


        // students whose rank is less than 50
        Map<Integer, List<Student>> filteredByRank = studentsList.stream()
                .filter(s -> s.getRank() < 50)
                .collect(Collectors.groupingBy(Student::getRank));

        filteredByRank.forEach((id, ll) -> {
            System.out.println(id + " : " + ll.stream().map(Student::getFirstName).toList());
        });

        //find students who live in delhi
        List<Student> delhi = studentsList.stream().filter(s -> s.getCity().equals("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).toList();
        System.out.println(delhi);

        //descending order
        List<Student> delhiDesc = studentsList.stream().filter(s -> s.getCity().equals("Delhi")).sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder())).toList();
        System.out.println(delhiDesc);

        //find all unique  departments
        Map<String, List<Student>> collect = studentsList.stream().collect(Collectors.groupingBy(Student::getDept));
        collect.keySet().forEach(d -> System.out.println(d + " "));

        //or
        List<String> list = studentsList.stream().map(Student::getDept).distinct().toList();
        System.out.println(list);

        //fetch contacts
        Map<String, List<String>> collect1 = studentsList.stream().collect(Collectors.toMap(Student::getFirstName, Student::getContacts));
        System.out.println(collect1);

        //fetch all contacts in list
        List<String> list1 = studentsList.stream().map(Student::getContacts).flatMap(List::stream).toList();
        System.out.println(list1);
        // one to one -> map
        // one to many -> flatmap


        // FETCH ALL STUDENTS BY  DEP
        Map<String, List<Student>> collect2 = studentsList.stream().collect(Collectors.groupingBy(Student::getDept));
        collect2.forEach((id,ll)->{
            System.out.println(id+ ll.stream().map(Student::getFirstName).toList());
        });

        // FETCH ALL STUDENTS BY  DEP and count
        Map<String, Long> collect3 = studentsList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        System.out.println(collect3);

        LongSummaryStatistics collect4 = collect3.values().stream().collect(Collectors.summarizingLong(x -> x));
        long max = collect4.getMax();
        System.out.println(max);

        Map<String, Long> collect5 = studentsList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));

        Map.Entry<String, Long> stringLongEntry = collect5.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry);


        //find average age of male and female students
        Map<String, Double> collect6 = studentsList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println(collect6);

        //find the highest rank in each department
        Map<String, List<Student>> collect7 = studentsList.stream().collect(Collectors.groupingBy(Student::getDept));
        System.out.println(collect7);
        collect7.forEach((s,ll)->{
            System.out.println(s+"->"+ ll.stream().map(Student::getRank).sorted().findFirst().get());
        });

        // find the student with second-highest  rank
        Student student = studentsList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
        System.out.println(student);

        List<Integer> integerList = List.of(1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 6, 7);
        List<Map.Entry<Integer, Integer>> list2 = integerList.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)).entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue)).toList();
        System.out.println(list2);


        //reverse the string
        String s = "Hello World";
        String reversed = s.chars()                                 // IntStream of chars
                .mapToObj(c -> String.valueOf((char) c))        // Convert int -> String
                .reduce("", (a, b) -> b + a);   // Reverse by prepending

        Optional<String> reduce = Arrays.stream(s.split("")).reduce((a, b) -> b + a);
        System.out.println(reduce.get());;


        //--------------------------------------------------------------------------------------------------
        // COUNT EACH OCCURRENCE IN STRING
        String input = "ilovejavatechie";
        Map<String, Integer> collect8 = Arrays.stream(input.split("")).collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println(collect8);

        Map<String, Long> collect9 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect9);

        // find all duplicate elements and store it in a list
        List<String> list3 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(v -> v.getValue() > 1)
                .map(Map.Entry::getKey).toList();
        System.out.println(list3);


        // find 1st non repeat element from string
        String key = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))

                .entrySet().stream().filter(v -> v.getValue() == 1).findFirst().get().getKey();
        System.out.println(key);

        // find second-highest element
        int [] arr ={5,9,11,2,8,21,1};
        Integer i = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);


        //find the longest string from given array
        String [] str = {"java","techie","springBoot","microservices"};
        String s1 = Arrays.stream(str).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(s1);

        // find elements that start with 1
        List<String> list4 = Arrays.stream(arr).boxed()
                .map(l -> l + "")                       // convert into string array
                .filter(word -> word.startsWith("1"))
                .toList();
        System.out.println(list4);

    // 1-2-3-4
        List<String> list5 = Arrays.asList("1", "2", "3", "4");
        String join = String.join("-", list5);
        System.out.println(join);
    }

}
