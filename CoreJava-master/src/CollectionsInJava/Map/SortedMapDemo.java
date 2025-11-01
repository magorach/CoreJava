package CollectionsInJava.Map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {

        SortedMap<Integer,String> map = new TreeMap<>((a,b)-> b-a);
        map.put(91,"Vivek");
        map.put(99,"Shubham");
        map.put(78,"Mohit");
        map.put(77,"Vipul");
//        System.out.println(map);
//        System.out.println(map.firstKey()); //77
//        System.out.println(map.lastKey());  //99
//        System.out.println(map.headMap(78));  // exclude
//        System.out.println(map.tailMap(91));
//        System.out.println(map.subMap(91,77));  // 77 excluded
        Map<Integer,String> navigableMap = new TreeMap<>();
        navigableMap.put(1,"One");
        navigableMap.put(5,"Five");
        navigableMap.put(3,"Three");
        navigableMap.put(2,"Two");
        navigableMap.put(4,"Four");



        System.out.println(navigableMap);
//        System.out.println(navigableMap.lowerKey(0));
//        System.out.println(navigableMap.ceilingKey(2));
//        System.out.println(navigableMap.higherEntry(1));
//        System.out.println(navigableMap.descendingMap());


    }
}
