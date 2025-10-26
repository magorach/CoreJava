package CollectionsInJava.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableHashMapDemo {
    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("B",2);
        map1.put("A",1);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
     //   System.out.println(map2.put("C",3)); // --> UnsupportedOperationException
        map1.put("C",3);
        System.out.println(map1);
        System.out.println(map2);
        Map<String, Integer> map3 = Map.of("Shivam", 98, "Vipul", 87, "Parul", 97);
        map3.put("Dinesh",78);
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Shipra", 88), Map.entry("Shubham", 98));  // - no limit of entries


    }
}
