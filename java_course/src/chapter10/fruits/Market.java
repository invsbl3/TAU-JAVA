package chapter10.fruits;

public class Market {
    public static void main(String[] args) {
        Fruit bananapple = new Banana(420);
        bananapple.makeJuice();
        ((Banana) bananapple).peel();
        bananapple = new Apple(50);
        bananapple.makeJuice();
        // ((Banana) bananapple).peel(); // Class cast exception
        ((Apple) bananapple).removeSeeds();

        bananapple = new Fruit();
        bananapple.makeJuice();


        Fruit fruit = new Fruit();
        fruit.makeJuice();
        // ((Banana) fruit).peel(); // Class cast exception
        // ((Apple) fruit).removeSeeds(); // Class cast exception


    }
}
