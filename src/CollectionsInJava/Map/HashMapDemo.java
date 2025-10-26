
package CollectionsInJava.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>  map = new HashMap<>();
        map.put(31,"Shivam");
        map.put(11,"Akshit");
        map.put(2,"Neha");
        map.put(2,"Akki");
//        map.put(null,"Vipul");
        map.put(null,"Priyal");
        System.out.println(map);
//        String Student = map.get(2);
//        System.out.println(map.get(23));
//        System.out.println(map.containsKey(23));
//        System.out.println(map.containsValue("Shivam"));

        Set<Integer> keys = map.keySet();
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
    }
}
