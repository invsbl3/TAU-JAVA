package chapter8.resources;
import static chapter8.resources.Functionalities.countWords;
import static chapter8.resources.Functionalities.reverseString;
import static chapter8.TextProcessor.*;
public class TheGame {
    public static void theGame() {
        System.out.println("""

                  Put a ~S I M P L E~ text here
                  OR choose a number between 1-5,
                  we got your back with some
                  beautiful phrases
                  we`re gonna count your words:
                """);
        scanner.nextLine();
        String yourText = scanner.nextLine();
        System.out.println("\n  Your text:\n");
        countWords(niceSimpleTexts(yourText));
        System.out.println("...\n\n  now mine...\n  Press any key to continue");
        try {
            scanner.nextLine();
        } catch (Exception _) {
        }
        countWords("I love coffee with chantilly cream, " +
                "if you're reading this, please help me buying one .-.");

        System.out.println("""

                  Do you want to see your text backwards?
                  Press any key to see...
                  ...Or shut down to not see .-.
                  (sorry we are a low budget company)
                """);
        try {
            scanner.nextLine();
        } catch (Exception _) {
        }
        reverseString(niceSimpleTexts(yourText));
    }

    public static String niceSimpleTexts(String option) {
        return switch (option) {
            case "1" -> "I'm afraid of hot sausage spiced sauces";
            case "2" -> "The dog barks for a floating leaf in the garden";
            case "3" -> "The cat walks all night in the street walls chasing food in the trash cans";
            case "4" -> "The programmer is the modern caveman but it's raining every day.";
            case "5" -> "Ok, enough, I have to go now .-.";
            default -> option;
        };
    }
}
