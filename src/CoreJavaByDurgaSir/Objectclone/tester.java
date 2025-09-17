package CoreJavaByDurgaSir.Objectclone;

public class tester {
    public static void main(String[] args) throws CloneNotSupportedException {

        Customer c1 = new Customer(101,new Address("Delhi"));

        Customer c2 = (Customer) c1.clone();
        c2.id =102;
        c2.address.city = "Mumbai";
        System.out.println(c1.id);
        System.out.println(c1.address.city);
        System.out.println(c2.address.city);
        System.out.println(c2.id);


    }
}
