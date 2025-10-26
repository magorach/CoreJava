package CollectionsInJava.ConcurrentCollections;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        for (int i = 1; i <= 5; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }
//        System.out.println("Initial CopyOnWriteArraySet : " + copyOnWriteArraySet);
//        System.out.println("Initial ConcurrentSkipListSet : "+ concurrentSkipListSet);
//
//        for (Integer num : copyOnWriteArraySet){
//            System.out.println("Reading from CopyOnWriteArraySet"+  num);
//
//            //attempting to modify
//            copyOnWriteArraySet.add(6);
//        }
        System.out.println(copyOnWriteArraySet);
        System.out.println("Iterating and modifying ConcurrentSkipListSet");
        for (Integer num : concurrentSkipListSet){
            System.out.println("Reading from ConcurrentSkipListSet : "+  num);

            //attempting to modify
           if (num == 5){
               concurrentSkipListSet.add(7);
           }

        }

    }
}
