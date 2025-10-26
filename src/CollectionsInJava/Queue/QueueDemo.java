package CollectionsInJava.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {

//        Queue<Integer> queue1 = new LinkedList<>();
//        queue1.add(1);
//        System.out.println(queue1.size());
////        System.out.println(queue1.remove());
//        System.out.println(queue1.poll());
//        // queue1 is empty
//        System.out.println(queue1.size());
//        System.out.println(queue1.peek());
////        System.out.println(queue1.element());
//        queue1.add(null);

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        queue2.add(1);
        queue2.offer(2);
        //queue2.add(3) ---> throw exception
        queue2.offer(3);// return false but didn't add any new element
        System.out.println(queue2);




















      //  LinkedList<Integer> queue1 = new LinkedList<>();
        //LinkedList as a stack
//        queue1.addFirst(10);
//        queue1.addFirst(20);
//        queue1.addFirst(30);
//        queue1.addFirst(40);
//        System.out.println(queue1);
//        System.out.println(queue1.removeFirst());   // pop
//        System.out.println(queue1);


        //linkedList as Queue

//        queue1.addLast(10);
//        queue1.addLast(20);
//        queue1.addLast(30);
//        queue1.addLast(40);
//        System.out.println(queue1);
//        System.out.println(queue1.removeFirst());
//        System.out.println(queue1);
//        System.out.println(queue1.getFirst());






























        //inbuilt methods in linked queue1
//        queue1.offer(10);
//        queue1.offer(20);
//        queue1.offer(30);
//        queue1.offer(40);
//        System.out.println(queue1);
//        queue1.offer(50);
//        System.out.println(queue1);
//        System.out.println(queue1.remove());
//        System.out.println(queue1);

    }
}
