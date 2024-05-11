package chapter8.resources;

import static chapter8.TextProcessor.scanner;

public class FirstMenu {

    public static void printOptions() {
        String[] options = {
                "POWERFUL Password Complexity Calculator"
                , "play ~The Game~",
                "reverse a text",
                "put spaces between Uppercase Glued words"};
        System.out.println("""

                  What do you want today?
                  Choose one of the options:
                """);
        for (int i = 0; i < options.length; i++) {
            System.out.printf("     %d- %s\n", (i + 1), options[i]);
        }
        System.out.println("\n  SUPER functionalities you gonna use\n" +
                "  EVERYDAY in your Personal Computer");
    }

    public static void chooseOption(int option) {
        switch (option) {
            case 1:
                PasswordValidator.passwordValidator();
                break;
            case 2:
                TheGame.theGame();
                break;
            case 3:
                Functionalities.reverseString(getText());
                break;
            case 4:
                Functionalities.putSpacesInText(getText());
                break;
            default:
                System.out.println("We don't do this here!");
                break;
        }
    }

    public static String getText() {
        System.out.println("""

                  Put a ~S I M P L E~ text here
                  we're gonna make some magic for you:
                """);
        scanner.nextLine();
        return scanner.nextLine();
    }
}
