package chapter2;
import java.util.Scanner;

public class SomeCoffeeStuff {
    public static void main(String[] args){
        System.out.println("Tell me an adjective: ");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.nextLine();
        System.out.println("Tell me a W H O L E number of your choice: ");
        int wholeNumber = scanner.nextInt();
        System.out.println("Tell me a season of the year not winter please: ");
        String notWinter = scanner.next();
        scanner.close();
        if (notWinter.equals("winter") || notWinter.equals("Winter")){
            System.out.println("I said not winter");
        } else{
            System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee.", adjective, notWinter, wholeNumber);
        }
    }
}
