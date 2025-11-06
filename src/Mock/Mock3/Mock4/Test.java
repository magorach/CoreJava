package Mock.Mock3.Mock4;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

    }

}
