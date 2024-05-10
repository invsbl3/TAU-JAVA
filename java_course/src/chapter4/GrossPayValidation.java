package chapter4;

import java.util.Scanner;

/*
For me, sometimes, the way you handle a situation
Is more important than the situation itself.
We are not machines.
*/

public class GrossPayValidation {
    public static void main(String[] args) {

        int hoursBusinessFunctioning = 5 * 12 + 2 * 6;
        int maxNonExtraHours = 8 * 5;
        int maxTryLimit = 3;
        int tryTimes = 0;
        int hourlyPay = 15;
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        if (hoursWorked > hoursBusinessFunctioning) {
            System.out.println("probably you worked a lot..." +
                    "please forgive this code and check with your" +
                    "supervisor about this question");
        }
        while (hoursWorked > maxNonExtraHours) {
            tryTimes++;
            System.out.println("The max non-extra hours a week per employee" +
                    " is " + maxNonExtraHours + " hours");
            System.out.println("how many non-extra hours did you do this week?");
            hoursWorked = scanner.nextDouble();
            if (tryTimes > maxTryLimit) {
                return;
            }
        }
        scanner.close();

        double gross = hourlyPay * hoursWorked;
        System.out.println("You Gross Pay without Extra-Hours is $" + gross);
    }
}
