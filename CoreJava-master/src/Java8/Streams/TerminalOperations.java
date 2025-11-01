package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3);

        //1) Collect
        List<Integer> collect = list.stream()
                .toList();
        System.out.println(collect);


        //2) forEach
        list.stream().forEach( System.out:: println);

        //2.1) forEachOrdered()--> useful in parallel stream-> print in encounter order
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Using forEach with parallel stream");
        num.parallelStream().forEachOrdered(System.out::println);
        System.out.println("----------------------------------");

        //3) reduce
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce.get());


        //4) matching operations- anyMatch(), allMatch(), noneMatch()
        boolean b = list.stream().anyMatch(x -> x > 2);
        System.out.println(b);


        System.out.println(list.stream().allMatch(x -> x>0));

        boolean b1 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b1);

        //5 finding operations
        System.out.println(list.stream().findFirst().get());  //--> find first
        System.out.println(list.stream().findAny().get());

        //6) count(), min(), max()
        long count = list.stream().count();
        System.out.println(count);

        Optional<Integer> max = list.stream().max(Integer::compare);
        System.out.println(max.get());

        Optional<Integer> min = list.stream().min(Integer::compare);
        System.out.println(max.get());

        //7) toArray() --> convert  any stream to array
        Stream.of(1, 2, 3).toArray();


        //examples
        //example 1 - > return those names whose lengths are greater than 3
        List<String> names = Arrays.asList("Anna","Bob","Charlie","David");
        List<String> list1 = names.stream().filter(x -> x.length() >3).toList();
        System.out.println(list1);

        //example 2) -> squaring and sorting
        List<Integer> numbers = Arrays.asList(5,2,9,1,6);
        System.out.println(numbers.stream().map(x->x*x).sorted().toList());

        System.out.println(numbers.stream().reduce(Integer::sum).get());

        //example 3) counting occurrences of character
        String sentence = "Hello World";
        IntStream chars = sentence.chars();
        long count1 = chars.mapToObj(ch -> (char) ch).filter(ch -> ch == 'l').count();
        System.out.println(count1);

        //example 4
        //streams cannot be resued after a terminal operation has been called
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
//        List<String> list2 = stream.map(String::toUpperCase).toList();
//        System.out.println(list2);

    }
}
