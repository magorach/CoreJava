package CoreJavaByDurgaSir.TypesOfInnerClasses;

public class Test {
    public static void main(String[] args) {


        //Member inner class
//        Car obj = new Car("Tata Curve");
//        Car.Engine obj2 = obj.new Engine();
//        obj2.start();
//        obj2.stop();
//        obj2.stop();

//        //Static inner class
//        Computer computer = new Computer("HP","ABC","Linux");
//        computer.getOs().displayInfo();
//        Computer.USB usb = new Computer.USB("Type C");
//        usb.displayInfo();


        //Annonmys inner class
//        ShoppingCart shoppingCart = new ShoppingCart(150);
//        shoppingCart.processPayment(new Payment() {
//            @Override
//            public void pay(double amount) {
//                System.out.println("Paid  "+ amount + " using Credit card");
//            }
//        });


        // local inner class
        Hotel hotel = new Hotel("Sunshine", 10,5);
        hotel.reservedRoom("Rachit",5);
        hotel.reservedRoom("Sumit",1);


    }
}
