package DesignPatterns.DecoratorDesignPattern;

public class KFC {
    public static void main(String[] args) {


        Burger burger = new TandooriPaneer();
        System.out.println(burger.getDescription()+ " : "+ burger.getCost());

//        burger = new ExtraCheeseBurger(burger);
//        System.out.println(burger.getDescription()+ " : "+ burger.getCost());

        burger = new ExtraMayoBurger(burger); // creating an instance of an extra mayo burger but holding in a reference of burger--> achieving runtime polymorphism
        System.out.println(burger.getDescription()+ " : "+ burger.getCost());

    }
}
