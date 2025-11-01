package DesignPatterns.DecoratorDesignPattern;

public class VegZinger extends Burger{
    @Override
    public String getDescription() {
        return "This is a VegZinger burger";
    }

    @Override
    public double getCost() {
        return 180.00;
    }
}
