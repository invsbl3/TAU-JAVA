package chapter4;

import java.util.Scanner;

public class CheckLetter {
    public static void main(String[] args) {
        System.out.println("Enter some little text here, please, LITTLE:");
        Scanner scanner = new Scanner(System.in);
        // scanner.next() take just a single word.
        String userText = scanner.nextLine();
        scanner.close();
        int numberOfAS = 0;
        if (userText.length() > 200) {
            System.out.println("Are you Shakespeare?");
        }
        for (int letter = 0; letter < userText.length(); letter++) {
            char letterNow = userText.charAt(letter);
            //System.out.println(letterNow);
            if (letterNow == 'A' ||
                    letterNow == 'a')
            // very important detail:
            // "A" is a String
            // 'A' is a char
            {
                numberOfAS++;
                System.out.println("Found a letter A in the position " + letter);
            }
        }
        System.out.printf("Found %d A's in total in this text", numberOfAS);
    }
}
