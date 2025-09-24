package CoreJavaByDurgaSir.Objectclone;

public class Customer implements Cloneable{

    int id;
    Address address;

    public Customer(int id, Address address) {
        this.id = id;
        this.address = address;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();  // shallow copy
//    }

    //deep copy with clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        Customer cloned = (Customer) super.clone(); // shallow copy of primitives + references
        cloned.address = (Address) this.address.clone(); // deep copy of Address
        return cloned;
    }
}
