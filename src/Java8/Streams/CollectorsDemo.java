package Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {


        //Collectors-> utility class
        // provides set of methods to create common collectors

        //1) collecting to a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> a = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(a);


        //2) collecting to a set
        List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5);
        Set<Integer> collect = nums.stream().collect(Collectors.toSet());
        System.out.println(collect);
        
        
        //3)collecting to a specific collection
        ArrayList<Integer> collect1 = nums.stream().collect(Collectors.toCollection(() -> new ArrayList<>()));


        //4) joining strings
        // concatenate stream elements into single string
        String collect2 = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(collect2);


        //5) Summarizing data
        //Generates statistical summary ( count, sum, average, max, min )
        
        List<Integer> numbers = Arrays.asList(2,3,5,7,11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: "+ stats.getCount());
        System.out.println("Sum: "+ stats.getSum());
        System.out.println("Min: "+ stats.getMin());
        System.out.println("Average: "+ stats.getAverage());
        System.out.println("Max: "+ stats.getMax());

        //6) calculating averages
        Double collect3 = numbers.stream().collect(Collectors.averagingInt(x->x));
        System.out.println(collect3);

        //7) counting elements
        Long collect4 = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: "+ collect4);

        //8) grouping
          //8.1) grouping by string length
        List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie","Raj","Aman");
        Map<Integer, List<String>> collect5 = names1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect5);
        //Key → string length
        //
        //Value → list of all strings with that length.


        //8.2) grouping employees by department
        List<Employee> employees = List.of(
                new Employee("Rachit", "IT"),
                new Employee("Parul", "HR"),
                new Employee("Aman", "IT"),
                new Employee("Simran", "HR")
        );
        Map<String, List<Employee>> grouped = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(grouped);
        grouped.forEach((dept,list)->{
            System.out.println(dept + " ->"+ list.stream().map(Employee::getName).toList());
        });



        //8.2) grouping employees by department + count
        Map<String, Long> countByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println(countByDepartment);
        //{
        //  HR=[Aman, Priya],
        //  IT=[Raj, Neha, Arjun]   ---> before applied counting
        //}


        //8.3) Grouping + Mapping (collect only names)

        Map<String, List<String>> deptNames = employees.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.mapping(Employee::getName,Collectors.toList())
                ));
        System.out.println(deptNames);

        //8.4) grouping and store it into tree map instead of normal hashmap

        List<String> words = Arrays.asList("hello", "world", "java"," streams","collecting");
        TreeMap<Integer, Long> collect6 = words.stream()
                .collect(Collectors.groupingBy(String::length,
                        TreeMap::new, Collectors.counting()
                ));
        System.out.println(collect6);



        //partition of elements
        List<Integer> integers = List.of(10, 15, 20, 25, 30);
        Map<Boolean, List<Integer>> collect7 = integers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect7);


        // toMap()
        System.out.println(names.stream().collect(Collectors.toMap(name -> name , name -> name.length())));
    }
}
class Employee {
    String name;
    String dept;
    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
    public String getDept() { return dept; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
