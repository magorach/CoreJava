package CollectionsInJava.ConcurrentCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {


//        List<String> shoppingList = new CopyOnWriteArrayList<>();
//        shoppingList.add("Milk");
//        shoppingList.add("Eggs");
//        shoppingList.add("Bread");
//        System.out.println("Initial Shopping List: "+ shoppingList);
//
//
//        for(String item : shoppingList ){
//            System.out.println(item);
//            if(item.equals("Eggs")){
//                shoppingList.add("Butter");
//                System.out.println("Added butter while reading. ");
//            }
//        }
//
//        System.out.println("Updated Shopping List. "+ shoppingList);


        List<String> sharedList =new CopyOnWriteArrayList<>( );
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");

        Thread readerThread = new Thread(()->{
            while (true){
                for (String item : sharedList){
                    System.out.println("Reading item: "+ item);
                    try {
                        Thread.sleep(1000);  // small delay to simulate the work
                    } catch (InterruptedException e) {
                        System.out.println("Exception in reader thread " + e);
                    }
                }
            }
        });

        Thread writerTHread = new Thread(()-> {
            try {
                Thread.sleep(500);
                sharedList.add("Item4");
                System.out.println(sharedList);
                System.out.println("Added to the list. ");

                sharedList.remove("Item1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        readerThread.start();
        writerTHread.start();
    }
}
