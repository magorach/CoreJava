package Java8.Streams;

import com.sun.jdi.request.StepRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.*;
import java.util.stream.Stream;

public class FunctionalInterfaceLearning {
    public static void main(String[] args) {

        //Predicate
//        Predicate<Integer> isEven = x -> x % 2 ==0;
//        System.out.println(isEven.test(4));
//
//        Predicate<String> isWordStartWithA = x -> x.toLowerCase().startsWith("a");
//        Predicate<String>   isWordEndWithT = x-> x.toLowerCase().endsWith("t");
//        Predicate<String> and = isWordStartWithA.and(isWordEndWithT);
//        System.out.println(and.test("Akshay"));

        //Function
        Function<Integer,Integer> multiplyBy2 = n -> n*2 ;
        Function<Integer,Integer> add10 = n-> n+10;

        Function<Integer, Integer> result1 = multiplyBy2.andThen(add10);
        System.out.println(result1.apply(5));

        Function<Integer, Integer> result2 = multiplyBy2.compose(add10);
        System.out.println(result2.apply(5));

        // one static method in function --> identity
        Function<Integer,Integer> identity = Function.identity();
        System.out.println( identity.apply(5));



        //Consumer
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(100);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i :x ){
                System.out.println(i);
            }
        };
        printList.accept(list);



        // Supplier
        Supplier<String> supplier = () -> "Hello from supplier";
        System.out.println(supplier.get());

        Supplier<Double> randomSupplierList =() -> Math.random();
        System.out.println(randomSupplierList.get());

        //combined example
        Predicate<Integer> predicate = x -> x % 2 ==0;
        Function<Integer,Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier1 = ()-> 100;


        if(predicate.test(supplier1.get())){
            consumer.accept(function.apply(supplier1.get()));
        }

        // BiPredicate, BiConsumer , BiFunction ---> takes two argument
        BiPredicate<String,String> isValid = (username, password) -> username.equalsIgnoreCase("admin") && password.equals("1234");

        System.out.println(isValid.test("ADMIN","1234"));



        //BiConsumer
        BiConsumer<String,Integer> printEntry = (name,age)-> System.out.println(name + " is " + age+ " years old.");

        Map<String, Integer> people = Map.of("Aman", 25, "Parul", 23);
        people.forEach(printEntry);

        //BiFunction
        BiFunction<String, String, Integer> biFunction = (x,y)-> (x+y).length();
        System.out.println(biFunction.apply("A","BC"));

       //  UnaryOperator
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        UnaryOperator<Integer> doubleAmount = x -> x*2;
        list1.replaceAll(doubleAmount);
        System.out.println(list1);

        // BinaryOperator
        BinaryOperator<Integer>  add = (a,b) -> a + b;
        System.out.println(add.apply(2,3));

    }
}
