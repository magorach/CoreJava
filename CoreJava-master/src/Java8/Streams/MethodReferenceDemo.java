package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class MethodReferenceDemo {
    public static void main(String[] args) {

//        BinaryOperator<Integer> maxc = (a,b)-> Math.max(a,b);
//        System.out.println(maxc.apply(20, 50));


        //reference to static method
        BinaryOperator<Integer> maxFunc = Math :: max;
        System.out.println(maxFunc.apply(10,2));

        // reference to an instance method of a particular object
        Example example = new Example();
        Supplier<String> s = example :: getMessage;
        System.out.println(s.get());


        // reference to an instance method of an Arbitrary object of a particular type
        List<String> list = Arrays.asList("java", "spring", "hibernate");
        list.forEach(System.out ::println);

        // reference to constructor 
        Supplier<Student> supplier = Student :: new;           // supplier = () -> new Student(); -- (lambda)
        Student student = supplier.get();

    }
}

class Example {

    public String getMessage(){
        return "Hello world";
    }
}

class Student {
    public Student(){
        System.out.println("Student object created");
    }
}