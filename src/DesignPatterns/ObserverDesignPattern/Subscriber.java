package DesignPatterns.ObserverDesignPattern;

public class Subscriber implements Observer{

    private  String name;

    Subscriber (String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Hello "+ this.name+" new video uploaded : "+message);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // both are pointing to the same object
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
