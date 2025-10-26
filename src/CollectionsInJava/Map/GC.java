package CollectionsInJava.Map;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {

        Phone phone = new Phone("Apple","17 pro");
//        System.out.println(phone);
//        phone = null;
//        // -> new Phone("Apple","17 pro"); this is avail. for GC
//        System.out.println(phone);



        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Samsung", "S25 Ultra"));
        System.out.println(phoneWeakReference.get());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ignored) {
        }
        System.out.println(phoneWeakReference.get());
    }
}

class Phone{

    private String brand;

    public String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
