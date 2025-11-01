package Java8.Streams.QuestionsJava8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuestionsOnStreams {
    public static void main(String[] args) {

        //1) collecting names by length
        List<String> names = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

        // 2) counting word occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(word->word, Collectors.counting()))
        );
        // output till split and convert it into list- [hello, world, hello, java, world]
        //final output-> {java=1, world=2, hello=2}

        //3) portioning even and odd numbers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(nums.stream().collect(Collectors.partitioningBy(x->x%2==0)));;  //-> output-> {false=[1, 3, 5], true=[2, 4, 6]}

        //4) summing values in a map
        Map<String,Integer> items = new HashMap<>();
        items.put("Apple",10);
        items.put("Banana",20);
        items.put("Orange",30);
        System.out.println(items.values().stream().reduce(Integer::sum).get());  //-> 60

        // second way
        System.out.println(items.values().stream().collect(Collectors.summingInt(x-> x)));

        //5) create a map from stream elements
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(list.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting())));  // {Apple=1, Cherry=1, Banana=1}
        // but we want fruit name as key and length its value
        System.out.println(list.stream().collect(Collectors.toMap(String::toUpperCase, String::length)));


        //6) using to map and find count of elements
        List<String> words2 = Arrays.asList("apple","banana","apple","orange","banana","apple");
        System.out.println(words2.stream().collect(Collectors.groupingBy(word -> word,Collectors.counting()))); //->  {orange=1, banana=2, apple=3}
        System.out.println(words2.stream().collect(Collectors.toMap(k-> k, v-> 1,(x,y)-> x+y)));

    }
}
