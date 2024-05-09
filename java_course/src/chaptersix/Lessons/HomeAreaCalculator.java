package chaptersix.Lessons;
import java.util.Scanner;

public class HomeAreaCalculator {
    // private: only accessible inside this method
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculator calculator = new HomeAreaCalculator(); // java has an implicit constructor
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        double area = calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);
        // calculator is an Object of the format HomeAreaCalculator
        // this Class opens a private scanner and uses it.
        // so, to use the Scanner of Calculator, we have to tell that
        // it's the calculator's scanner....
        // this is confusing because 'main' is inside the Class...
        // but think about if 'main' was in another file, that clarifies the question
        calculator.scanner.close();
    }

    public static double calculateTotalArea(Rectangle... args) {
        double totalArea = 0;
        for (Rectangle r : args) {
            totalArea += r.calculateArea();
        }
        return totalArea;
    }

    public Rectangle getRoom() {
        //String rectangleName = getRectangleName(r);
        System.out.println("Enter the length of this room :");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of this room :");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }
}