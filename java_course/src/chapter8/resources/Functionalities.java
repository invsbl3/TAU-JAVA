package chapter8.resources;

public class Functionalities {

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;
        if (numberOfWords < 600) {
            System.out.println("\"\"\n  " + text + "\n\"\"\n");
        } else {
            System.out.println("Are you Shakespeare?");
        }
        System.out.printf("  This text contains %d words", numberOfWords);
    }

    public static void reverseString(String text) {
        StringBuilder reversedText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText.append(text.charAt(i));
        }
        System.out.println("\n " + reversedText);
    }

    public static void putSpacesInText(String text) {
        StringBuilder newText = new StringBuilder(text);
        for (int i = 0; i < newText.length(); i++) {
            if (i != 0 && Character.isUpperCase(newText.charAt(i))) {
                newText.insert(i, " ");
                i++;
            }
        }
        System.out.println("\n " + newText);
    }
}