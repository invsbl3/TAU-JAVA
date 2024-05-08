package chapterfour;

import java.util.Scanner;

public class RowDieGame {
    public static void main(String[] args) {
        int totalPoints = 0;
        int totalRolls = 5;
        int diceMin = 1;
        int diceMax = 6;
        System.out.println("Game Started! \n You're with " + totalPoints + " now" +
                "\n roll the dice!");
        Scanner scanner = new Scanner(System.in);

        int roll = 0;
        do {
            scanner.next();
            int diceResult = (int)(diceMax * Math.random()) + diceMin;
            System.out.println("You rolled the dice! It gave you " + diceResult + " points!");
            totalPoints += diceResult;
            if (totalPoints < 20) {
                System.out.println("You rolled the dice " + (roll + 1) + " times and have " + totalPoints + " points now");

            }

            if (totalPoints > 20) {
                System.out.println("You won!");
            }
            roll++;
        } while (roll < totalRolls && totalPoints < 20);
        if (totalPoints < 20) {
            System.out.println("You lose!");
        }

    }

}
