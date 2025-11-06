package Java8.Streams.Optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> name = getName(2);
//        if(name.isPresent()){
//            System.out.println(name.get());
//        }
        String nameToBeUsed = name.orElse("NA");  // return value if present, or else other
       // name.ifPresent(System.out::println);
        System.out.println(nameToBeUsed);
    }
    private static Optional<String> getName(int id ){
//        String name = "null";
        return Optional.empty();
    }
}

