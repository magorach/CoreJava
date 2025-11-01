package CoreJavaByDurgaSir.Objectclone;

public class Address implements Cloneable{

    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
