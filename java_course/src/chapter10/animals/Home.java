package chapter10.animals;

public class Home {
    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);


        Animal sasha = new Dog();
        sasha.makeSound();
        sasha = new Cat();
        sasha.makeSound();
        feed(sasha);
    }

    public static void feed(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("here's your cat food");
        } else if (animal instanceof Dog) {
            System.out.println("here's your dog food");
        }
    }
}
