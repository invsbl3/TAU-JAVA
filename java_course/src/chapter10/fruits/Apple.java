package chapter10.fruits;

public class Apple extends Fruit {
    public void removeSeeds() {
        System.out.println("Seeds removed from your Apple");
    }

    public Apple(double calories) {
        this.calories = calories;
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice");
    }
}
