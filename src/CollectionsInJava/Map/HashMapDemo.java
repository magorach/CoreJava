
package CollectionsInJava.Map;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>  map = new HashMap<>();
        map.put(31,"Shivam");
        map.put(11,"Akshit");
        map.put(2,"Neha");
        map.put(2,"Akki");
        System.out.println(map);
//        map.put(null,"Vipul");
       // map.put(null,"Priyal");
//        System.out.println(map);
//        String Student = map.get(2);
//        System.out.println(map.get(23));
//        System.out.println(map.containsKey(23));
//        System.out.println(map.containsValue("Shivam"));

//        Set<Integer> keys = map.keySet();
//        for (int i : keys){                 // --->> this will give ConcurrentModificationException
//            if(i==2){
//                map.remove(i);
//            }
//        }

//        Iterator<Integer> it = keys.iterator();
//        while (it.hasNext()){
//            Integer desiredKey =it.next();
//            if (desiredKey == 2){
//                it.remove();
//            }
//        }
//        System.out.println(map);
//
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer, String> e : entries){
//            System.out.println(e.getKey()+": "+ e.getValue().toUpperCase());
//        }
//        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
//        while (it.hasNext()){
//            Map.Entry<Integer, String> entry = it.next();
//            if(entry.getKey()==2){
//                it.remove();
//            }
//        }
//        System.out.println(map);


//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Iterator<Integer> iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            System.out.print(iterator.next());
//        }

        Iterator<Map.Entry<Integer, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer, String> next = iterator1.next();
            System.out.print(next.getKey()+" ");
            System.out.print(next.getValue()+" ");
        }


    }

}
