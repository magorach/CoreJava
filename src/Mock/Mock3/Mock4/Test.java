package Mock.Mock3.Mock4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String name = "RachitMago";
        Map<String, Integer> collect = Arrays.stream(name.toLowerCase().split("")).collect(Collectors.toMap(c -> c, v -> 1, (x, y) -> x + y));
        List<Map.Entry<String, Integer>> collect1 = collect.entrySet().stream().filter(k -> k.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect1);

        LinkedHashMap<String, Long> collect2 = Arrays.stream(name.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Map.Entry<String, Long> stringLongEntry = collect2.entrySet().stream().filter(v -> v.getValue() == 1).findFirst().get();
        System.out.println(stringLongEntry.getKey());

        List<Integer> list = Arrays.asList(-1, 0, -2, 3, 5, 6, -8);
        Integer i = list.stream().sorted((a, b) -> b - a).skip(2).findFirst().get();
        System.out.println(i);

    }

}
