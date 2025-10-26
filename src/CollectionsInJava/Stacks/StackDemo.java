package CollectionsInJava.Stacks;

import LambdaExpressionLearning.LengthInter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

//        Stack <Integer> stack= new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.peek());
////        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.isEmpty());
//
//        int search = stack.search(2);
//        System.out.println(search);


        //linkedList as stack
//        LinkedList <Integer> ll = new LinkedList<>();
//        ll.addLast(10); // --->push
//        ll.addLast(11);
//        ll.addLast(12);
//        System.out.println(ll);
//        System.out.println(ll.getLast());    //--> peak
//        System.out.println(ll.removeLast());   //-> pop


        //ArrayList as stack
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        System.out.println(arrayList);
        System.out.println(arrayList.get(arrayList.size()-1));  // -> peek
        System.out.println(arrayList.remove(arrayList.size()-1));
        System.out.println(arrayList);
    }
}
