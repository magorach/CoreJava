package LambdaExpressionLearning;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System starts...");

//        MyInter myInter = new MyInterImpl();
//        myInter.sayHello();
//
//        //anonymous class
//        MyInter i = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("hello from anonymous class");
//            }
//        };
//        i.sayHello();
//
//        MyInter myInter1 = ()-> System.out.println("Hello from lambda");
//        myInter1.sayHello();

        SumInter sumInter =(a, b) -> a + b;
        System.out.println(sumInter.sum(10,20));

        LengthInter lengthInter =(s -> s.length());
        System.out.println(lengthInter.getStringLength("Hello"));
    }
}
