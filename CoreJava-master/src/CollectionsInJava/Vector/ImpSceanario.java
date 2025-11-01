package CollectionsInJava.Vector;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class ImpSceanario {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                list.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                list.add(i);
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list.size());  // Expected Output 2000

    }
}
