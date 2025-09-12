package Generics;

public class Box <T>{

    T value;      // T is a placeholder for any data type

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
