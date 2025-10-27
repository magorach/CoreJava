package DesignPatterns.DecoratorDesignPattern;

public class TandooriPaneer extends Burger{
    @Override
    public String getDescription() {
        return "This is a Special Tandoori burger";
    }

    @Override
    public double getCost() {
        return 250.00;
    }
}
