package CollectionsInJava.LinkedLIstDemo;

import java.util.*;

public class InBuiltLinkedList {
    public static void main(String[] args) {

//        LinkedList <Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//        System.out.println(list.get(1));  // O(N)
//        list.addFirst(0);  //O(1)
//        list.addLast(4);   //O(1)
//        System.out.println(list);
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        list.removeIf(x-> x %  2==0);
//        System.out.println(list);
//
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalsToRemove =  new LinkedList<>(Arrays.asList("Lion","Dog"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);

        //Stack behavior of linked list
//        Stack<Integer> stack = new LinkedList<>(); --> CTE-> required stack provided linked list
//        LinkedList<Integer> stack = new LinkedList<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push((30));
//        System.out.println("Stack  "+ stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println("Stack after pop "+ stack);
//
//        //Queue behavior of linked list
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(10);
//        queue.offer(20);
//        queue.offer(30);
//
//        System.out.println("Queue: " + queue); // [10, 20, 30]
//
//        System.out.println("Poll: " + queue.poll()); // 10
//        System.out.println("Peek: " + queue.peek()); // 20
//        System.out.println("Queue after poll: " + queue); // [20, 30]


        //Modern behavior of stack
//        Deque<Integer> stack = new LinkedList<>();   w2w222222ww2x
//        stack.push(10);
//        stack.push(20);
//        System.out.println(stack);

        Deque<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue); // [10, 20, 30]

        System.out.println("Poll: " + queue.poll()); // 10
        System.out.println("Peek: " + queue.peek()); // 20
        System.out.println("Queue after poll: " + queue); // [20, 30]
    }
}
