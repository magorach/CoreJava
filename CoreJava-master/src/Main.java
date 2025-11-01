import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Parent obj = new Parent();
//        System.out.println(obj.d);
//        System.out.println(obj.d2);
//        obj.fun();
//        obj.fun2();

//        Parent obj = new C();
//        System.out.println(obj.d);
//        System.out.println(obj.d2);
//        System.out.println(((C) obj).d1);
//        obj.fun();
//        obj.fun2();
//        ((C) obj).fun1();
//        C obj = new Parent();

//        Animal obj = new Dog();
//        obj.sound();
//        obj.sleep();

//        Animal obj = new Animal() {
//            @Override
//            void sound() {
//                System.out.println("Bark Bark");
//            }
//        };
//        obj .sound();

        //Anonymous inner class that implements runnable interface
        // ----> not useful  if you want to use it for multiple threads
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread running");
//            }
//        });
//        t.start();

//        // When t.start() is called → JVM calls run() internally → executes the lambda body → prints "Thread running...".
//        Thread t = new Thread(() -> System.out.println("Thread is running"));
//        t.start();
//
//        //you can assign lambda to a variable if needed and make it reusable
//        Runnable task = ()-> System.out.println("Thread 2 is running ");
//        Thread t1 =new Thread(task);
//        Thread t2 =new Thread(task);
//     //Interview punch
//        //That line works because Runnable is a functional interface with a single abstract method run().
//        //Java 8 allows us to replace anonymous inner classes with lambdas, making the code shorter, more readable, and easier to reuse.
//
//        System.out.println(t2.getName());
//        System.out.println(t1.getName());

//
        E obj = new E();
        obj.get();

    }
}