package chapter5;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        greetUser(name);
    }

    public static void greetUser(String name) {
        if (name.equals("Lord of Java")) {
            System.out.println("Hello, Master, want some coffee?");
        } else System.out.println("Hi there, " + name);
    }
}
