package chapter11.farm;

public class Farm {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // abstract cant be instantiated
        Animal animal = new Pig();
        System.out.println("animal is from the class " + animal.getClass().getSimpleName());
        animal.makeSound();
        animal.eat();
        animal = new Duck();
        System.out.println("animal is from the class " + animal.getClass().getSimpleName());
        animal.makeSound();
        animal.eat();
        // ((Pig) animal).makeSound(); // Class Cast Exception

        Pig pig = new Pig();
        pig.makeSound();
        pig.eat();
        // pig = new Duck(); // incompatible types
    }
}