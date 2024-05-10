package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Tell a number between 1 and 7:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("This number represents the " + getDayOfTheWeek(scanner.nextInt()));
    }

    public static String getDayOfTheWeek(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Otherday";
        }
    }
}
