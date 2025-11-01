package Java8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Apoorv","Akshit");

        //1) filter --> accepts predicate
        Stream<String> fiteredStream = list.stream().filter(x -> x.startsWith("A"));
        // no filtering at this point
        long res = fiteredStream.count();
        System.out.println(res);

        // 2) map(Function<T, R> mapper)
        list.stream().
                map(String::toUpperCase).
                forEach(System.out::println);       // terminal operation

        //3 FlatMap(Function<T, Stream<R>> mapper)

        //3.1)
        List <List<Integer>> ll = List.of(List.of(1,2), List.of(3,4));
        ll.stream()
                . flatMap(List ::stream)
                .forEach(System.out::println);

        //3.2)
        List<List<String>> list1 = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        List<String> list2 = list1.stream().flatMap(List::stream).map(String::toUpperCase).toList();
        System.out.println(list2);

        //3.3)
        List<String> list3 = Arrays.asList(
                "Hello.World",
                "Java.streams.are.powerful",
                "flat.map.is.useful"
        );
        System.out.println(list3.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\.")))
                .map(String::toUpperCase)
                .toList());

        //4) sorted()
        List<String> fruits = Arrays.asList("Banana","Apple","Mango");
        fruits.stream()
                .sorted()
                .forEach(System.out::println);


        //5) sorted(Comparator<T> comparator) --> custom sorting
        fruits.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        //6 limit(long maxSize)
        List<Integer> numbers = List.of(1,2,3,4,5);
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        //7 skip(long n)
        numbers.stream()
                .skip(2)
                .forEach(System.out::println);

        //8) peek (Consumer <T> action)
        numbers.stream()
                .peek(x -> System.out.println("Processing "+ x))       // variable names inside the lambda are local and independent
                .map(n -> n*n)
                .forEach(System.out::println);

        //9 distinct()
       List<String> str =  list.stream()
                .filter(x -> x.startsWith("A"))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(str);

    }
}
