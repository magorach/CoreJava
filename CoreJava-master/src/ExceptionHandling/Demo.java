package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    static {
        System.out.println(" hi");
    }

    public static void main(String[] args) {

        new RethorwDemo2().m2();

//        Thread t = new Thread();
//        t.start();
//        t.start();

        // iterator practice

//        List<String> ll = new ArrayList<>();
//        ll.add("Java");
//        ll.add("Spring");
//        ll.add("Hibernate");
//
//        Iterator<String> it = ll.iterator();
//        while (it.hasNext()){
//            String item = it.next();
//            System.out.println(item);
//
//            if (item.equals("Spring")){
//                it.remove();
//            }
//        }
//        System.out.println("After removal"+ ll);


//        Integer x =5;
//        int y = 10;
//
//        assert x > y : "x is smaller than y";
//        System.out.println(x+y);
//
//        // java 9
//        FileReader fr = new FileReader("input.txt");
//        PrintWriter pw = new PrintWriter("output.txt");
//
//        try {
//            System.out.println(10/0);
//            String str = null;
//            System.out.println(str);
//        }catch (ArithmeticException | NullPointerException e ) {
//            System.out.println(e);
//        }
//        try {
//            new RethrowDemo().readFile();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
    }


}
class RethrowDemo{

    void readFile() throws Exception {
        try {
            throw new IOException("File not found");
        } catch (IOException e) {
            System.out.println("Caught in readFile, wrapping in custom exception.....");
            throw new Exception("Another exception:", e); // chaining
        }
    }
}

class RethorwDemo2{

    void m1() throws ArithmeticException {
        try {
            int data = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in m1, rethrowing...");
            throw e; // rethrowing the same exception
        }
    }
    void m2(){
        try{
            m1();
        }catch (ArithmeticException o){
            System.out.println("handled in m2");
        }
    }

}

