package CollectionsInJava.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67);
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.remove(67));
        System.out.println(set);
        set.clear();
        System.out.println(set.isEmpty());
        
        
        // for thread safety
        Set<Integer> integers = Collections.synchronizedSet(set); // - don't use this coz this makes all operations on
        // set synchron. only one thread at a time access it

        //-> sorted and thread safe version of a set
        ConcurrentSkipListSet<Integer> set1 = new ConcurrentSkipListSet<>();

        //unmodifiable set
        Set<Integer> integers1 = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22);


    }
}
