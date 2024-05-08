package chapterthree;

/*
Multiple lines comment
Everyone get a payment of $3000 a week.
The ones that sale 10 or more get a bonus of $800
*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]){

        double salary = 3000;
        double bonus = 800;
        double minSalesToGetBonus = 10;
        System.out.println("How many sales did the employee made this week?");
        Scanner scanner = new Scanner(System.in);
        double sales = scanner.nextDouble();
        if (sales >= minSalesToGetBonus){
            salary += bonus;
            System.out.print("Congrats!");
        }else{
            double salesLeft = minSalesToGetBonus - sales;
            System.out.printf("This enterprise is focused on sales quotas \n" +
                    "an we're going to tell you that you left\n" +
                    "%.2f sales left this month.", salesLeft);

        }
        System.out.println("The employee's pay is $" + salary);
    };
};
