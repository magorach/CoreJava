package CollectionsInJava.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer>  linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put("Orange",10);
        linkedHashMap.put("Apple",20);
        linkedHashMap.put("Guava",13);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey()+ ": "+ entry.getValue());
        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Orange",10);
        hashMap.put("Apple",20);
        hashMap.put("Guava",13);


        System.out.println("Entries by hashmap");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+ ": "+ entry.getValue());

        }

    }
}
