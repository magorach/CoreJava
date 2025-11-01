package Java8.Streams;

import javax.naming.ldap.StartTlsRequest;
import javax.xml.stream.events.StartDocument;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> list1 = list.stream().map(ParallelStream::factorial).toList();
        System.out.println(list1);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with  sequential  stream" + (endTime - startTime)+ " ms ");

        long beginTime = System.currentTimeMillis();
        List<Long> list2= list.parallelStream().map(ParallelStream::factorial).toList();
//        List<Long> list2= list.parallelStream().map(ParallelStream::factorial).sequential().toList(); //-> converting parallel stream to sequential
        System.out.println(list1);
        long finishTime = System.currentTimeMillis();
        System.out.println("Time taken with stream" + (finishTime - beginTime)+ " ms ");


        /* cumulative sum----> har element previous element ke result par dependent h and hum only, in multithreading env. mein independent tasks  ko parallel execute karate h
        [1,2,3,4,5] -> [1,3,6,10,15]
        cumulative sum is dependent on sequential order  but parallel stream guarantee ni karti order of execution ki
        if we replace that with stream ,it will work

         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> list3 = numbers.stream().sequential().map(sum::addAndGet).toList();
        System.out.println(list3); //-> wrong output coz this is not independent

    }

    private static long factorial (int n){
        long result = 1;
        for (int i =2;i<= n;i++){
            result *= i;
        }
        return result;
    }
}
