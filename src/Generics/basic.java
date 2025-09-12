package Generics;

import org.w3c.dom.ls.LSOutput;

public class basic {
    public static void main(String[] args) {
//
//        String [] arr = { "Ankit", "Raju", "Pappu","Meera"};
//        display(arr);;
//        Integer [] arr1 = {1,2,3,4,5};
//        System.out.println();
//        display(arr1);



        Box <String> obj1 = new Box<>();;
        obj1.setValue("Hello");
        System.out.println("value"+" : "+ obj1.getValue());

        Box<Integer> obj2 = new Box<>();
        obj2.setValue(10);
        System.out.println("value"+" : "+ obj2.getValue());


    }

//    public static void Display(String [] arr){
//        for (String entry : arr){
//            System.out.println(entry);
//        }
//    }

    //genric method

//    public static <T> void display(T [] arr){
//        for (T entry : arr){
//            System.out.print(entry+ " ");
//        }
//    }




}
