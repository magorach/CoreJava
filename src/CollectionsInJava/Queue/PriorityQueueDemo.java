package CollectionsInJava.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

//        Queue<Integer> pqueue = new PriorityQueue<>(3);
//        System.out.println(pqueue.size());
//        pqueue.add(20);
//        pqueue.add(30);
//        pqueue.add(10);
//        pqueue.add(40);
//        System.out.println(pqueue);
//        System.out.println(pqueue.peek());
//        System.out.println(pqueue.poll());
//        System.out.println(pqueue);
//        System.out.println("Size after addition : "+  pqueue.size());
//        System.out.println("Peek : " + pqueue.peek());
//        System.out.println("Removing " + pqueue.remove());
//        System.out.println("pqueue after removal "+ pqueue);

        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        //PriorityQueue<Integer> pq = new PriorityQueue<>(pqueue);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(5);
       // System.out.println(pq);  //--> not sorted
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}