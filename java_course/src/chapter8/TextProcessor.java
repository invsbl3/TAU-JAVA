package chapter8;
import chapter8.resources.FirstMenu;

import java.util.Scanner;
import java.io.Console;

public class TextProcessor {

    public static final Scanner scanner = new Scanner(System.in);
    public static final Console console = System.console();

    public static void main(String[] args) {
        FirstMenu.printOptions();
        int option = scanner.nextInt();
        FirstMenu.chooseOption(option);
        System.out.println("\n  That's All, Folks!");
    }
}
