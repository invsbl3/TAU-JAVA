package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 20;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0) return true;
        else return false;
    }

    public static void printTicket(int ticket[]) {
        System.out.print("\n");
        System.out.print(" | ");
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(String.format("%02d", ticket[i]) + " | ");
            if ((i + 1) % 5 == 0 && i < (LENGTH - 1)) {
                System.out.print("\n");
                System.out.print(" | ");
            }
        }
        System.out.print("\n");
    }
}
