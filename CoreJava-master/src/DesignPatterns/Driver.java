package DesignPatterns;

public class Driver {
    public static void main(String[] args) {

        Dog dog1 = new Dog.DogBuilder().setName( "Brunu").setGender("Male").setBreed("Pug").setPrice(203.434).setName("Ouru").build();

        Dog dog2 = new Dog.DogBuilder().setGender("Female").setName("Alissa").build();
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
