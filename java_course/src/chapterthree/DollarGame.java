package chapterthree;

import java.util.Scanner;

public class DollarGame {
    public static void main(String args[]) {

        String[] coinTypes = {"pennies", "nickels", "dimes", "quarters"};
        int[] coinValues = {1, 5, 10, 25};
        int gameSum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < coinTypes.length; i++) {
            System.out.printf("Tell an amount of %s:", coinTypes[i]);
            gameSum += (int) (Math.round(scanner.nextDouble()) * coinValues[i]);
        }
        if (gameSum == 100) System.out.println("CONGRATS, YOU WIN THIS SUPER-GAME!");
        else if (gameSum > Math.pow(10, 8)) System.out.println("You are a Millionaire, but LOST THIS GAME!");
        else System.out.println("You lose");
    }
}
