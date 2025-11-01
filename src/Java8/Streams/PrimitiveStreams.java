package Java8.Streams;

import java.lang.instrument.Instrumentation;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};
        IntStream stream = Arrays.stream(numbers);

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
       System.out.println(intStream.sum());

       IntStream.range(1, 5)
                .forEach(System.out::println);

        int sum = IntStream.of(10, 20, 30, 40).sum();
        double average = IntStream.of(10, 20, 30, 40).average().orElse(0);
        int max = IntStream.of(10, 20, 30, 40).max().orElse(0);

        System.out.println("sum: "+ sum);
        System.out.println("double : "+ average);
        System.out.println("Max: "+ max);

        //Mapping and Filtering
        IntStream.rangeClosed(1,10)
                .filter(n-> n %2 ==0)
                .map(n-> n*n)
                .forEach(System.out::println);

        //Convert Stream<Integer> → IntStream
        List<Integer> list = List.of(1, 2, 3, 4);
        int sum1 = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

        //Convert IntStream → Stream<Integer>
        IntStream.range(1,5)
                .boxed()
                .forEach(System.out::println);



        //Random class
        DoubleStream doubles = new Random().doubles(5);
        List<Double> collect = doubles.boxed().collect(Collectors.toList());
        System.out.println(collect);

        IntStream ints = new Random().ints(5);
        List<Integer> collect1 = ints.boxed().collect(Collectors.toList());
        System.out.println(collect1);

    }
}
