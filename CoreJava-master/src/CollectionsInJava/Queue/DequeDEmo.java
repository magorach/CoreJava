package CollectionsInJava.Queue;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;


public class DequeDEmo {
    public static void main(String[] args) {

        Deque<Integer> deque1 = new ArrayDeque<>();
//        deque1.addFirst(10);
//        deque1.addLast(20);
//        deque1.offerFirst(5);
//        deque1.offerLast(25);
//        //5,10,20,25
//        System.out.println(deque1);
//        System.out.println(deque1.getFirst());  //5
//        System.out.println(deque1.getLast());  //25
//        System.out.println(deque1.pollLast());  //25
//        System.out.println(deque1);
//        System.out.println(deque1.removeFirst());  //5
//        System.out.println(deque1);
//        //[10,20]
//
//        for (int num: deque1){
//            System.out.println(num);
//        }

        Deque<Integer> deque2 = new LinkedList<>();   // insertion and deletion somewhere in the middle
        deque2.addFirst(10);
        deque2.addLast(20);
        deque2.addLast(30);
        System.out.println(deque2);
        System.out.println(deque2.remove(20));
        System.out.println(deque2);


    }
}
