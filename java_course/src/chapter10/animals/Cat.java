package chapter10.animals;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void scratch() {
        System.out.println("your sofa is ruined. Scraaatch");
    }
}
