package chapter10.fruits;

public class Banana extends Fruit {
    public void peel() {
        System.out.println("Your banana was peeled");
    }

    public Banana(double calories) {
        this.calories = calories;
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana with Milk");
    }
}
