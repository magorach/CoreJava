package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Demo {
    public static void main(String[] args) {

        //feature introduced in java 8
        //process collections of data in a functional and declarative manner
        // improves readability and maintainability
        // enable easy parallelism ( multithreading ki complexity se deal kre bina hum parallelism achieve kar sacte h

        // Stream creation
        //1) From Collection
        List<String> list = Arrays.asList("Java","Python","C++");
        Stream<String> stream1 = list.stream();


        //2) From an Arrays
        String [] arr = {"A","B","C"};
        Stream<String> stream2 = Arrays.stream(arr);


        //3 From fixed set of values
        Stream<Integer> stream3 = Stream.of(1,2,3,4,5);

        
        //4 FRom infinite stream
        Set<Integer> collect = Stream.generate(() -> 1).limit(10).collect(Collectors.toSet());
        List<Integer> collect1 = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect1);


        List<Integer> number = Arrays.asList(1,2,3,4,5);
//        int count = 0;
//        for (int i : number){
//            if (i % 2 ==0){
//                count++;
//            }
//        }
//        System.out.println(count);

        long count1 = number.stream().filter(x -> x % 2 == 0).count();
        System.out.println("count1 "+ count1);


    }
}
