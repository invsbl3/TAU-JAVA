package chaptersix.Phone;

import java.util.Scanner;

public class PhoneBillCalculator {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        double id = getId();
        double allottedMinutes = getAllottedMinutes();
        double minutesUsed = getMinutesUsed();
        double baseCost = getBaseCost();
        scanner.close();
        PhoneBill phoneBill = new PhoneBill(id, baseCost, allottedMinutes, minutesUsed);
        phoneBill.printItemizedBill();

    }

    public static double getId() {
        System.out.println("Input you id");
        return scanner.nextDouble();
    }

    public static double getAllottedMinutes() {
        System.out.println("Input you plan allotted minutes:");
        return scanner.nextDouble();
    }
    public static double getMinutesUsed() {
        System.out.println("Input you plan used minutes:");
        return scanner.nextDouble();
    }
    public static double getBaseCost() {
        System.out.println("Input you plan Base Cost:");
        return scanner.nextDouble();
    }


}
