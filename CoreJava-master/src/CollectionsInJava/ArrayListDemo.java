package CollectionsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayListDemo {
    public static void main(String[] args) {



        //convert list to array
//        List<String> ll = List.of("Banana","Cherry","Apple");
//
//        String[] array = ll.toArray(new String[0]);
//
//        for (String fruit: array){
//            System.out.print(fruit + " ");
//        }



     List<Integer> ll1 = new ArrayList<>();
     ll1.add(2);
        ll1.add(1);
        ll1.add(3);
        ll1.sort(null);
//        Collections.sort(ll1);
        System.out.println(ll1);












//  List<Integer>  list = new ArrayList<>();
//  list.add(1);
//  list.add(2);
//  list.add(3);
//  list.add(0,0);
//  System.out.println(list);
//
//  List<String> fruits = new ArrayList<>();
//  fruits.add("Apple");
//  fruits.add("Apple");
//  fruits.add("Banana");
//  fruits.add("Cherry");
//  fruits.add("Banana");
//  fruits.add("Date");
//  System.out.println(fruits);
//  fruits.remove("Apple");
//        System.out.println(fruits);




//  List<Integer> list1 = List.of(4, 5, 6, 7, 8);
//  list.addAll(list1);
//  System.out.println(list);


















//        ll.set(1,"Sunday");
////        ll.add("Fridabley"); // notpossi
////        System.out.println(ll);
////        System.out.println(ll.getClass().getName());
////
////
//        String [] arr = {"Apple","Banana","Cherry"};
//        List<String> list = Arrays.asList(arr);
//        System.out.println(list);
//       List<String> list1 = new ArrayList<>(list);
//       list1.add("Mango");
//        System.out.println(list1);
//        System.out.println(ll.getClass().getName());


        //new java version
//        List<Integer> list1 = List.of(1, 2, 3);
//        System.out.println(list1.getClass().getName());


//        ArrayList<Integer> arrayList = new ArrayList<>();
//        System.out.println(arrayList.size());
//        arrayList.add(10);
//        arrayList.add(11);
//        arrayList.add(12);
//
//        arrayList.add(1, 3);
//        System.out.println(arrayList);


//        System.out.println(arrayList);
//        System.out.println(arrayList.size());
//        System.out.println(arrayList.get(1));
//        for (int x : arrayList){
//            System.out.println(x);
//        }
//        System.out.println(arrayList.contains(39));
//        arrayList.remove(0);
//        System.out.println(arrayList.size());
//    }
    }
}