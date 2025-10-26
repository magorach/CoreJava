package DesignPatterns;

public class Dog {

    private String name;
    private String gender;   // cannot change
    private String breed;    // cannot change
    private double price;

    public Dog(DogBuilder dogBuilder) {
        this.name = dogBuilder.getName();
        this.gender= dogBuilder.getGender();
        this.breed = dogBuilder.getBreed();
        this.price= dogBuilder.getPrice();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", breed='" + breed + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public static class DogBuilder{
        private String name;
        private String gender;   // cannot change
        private String breed;    // cannot change
        private double price;

        public String getName() {
            return name;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getBreed() {
            return breed;
        }

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public double getPrice() {
            return price;
        }

        public DogBuilder setPrice(double price) {
            this.price = price;
            return this;
        }
        public Dog build(){
            return new Dog (this);
        }
    }
}
