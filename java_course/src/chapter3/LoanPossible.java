package chapter3;
import java.util.Scanner;

public class LoanPossible {
    public static void main(String args[]) {

        double requiredSalary = 30000;
        double requiredYears = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        System.out.println("How many years you`ve been" +
                " working in your current job?");
        double years = scanner.nextDouble();
        if (salary >= requiredSalary && years >= requiredYears) {
            System.out.println("You qualify for the loan.");
        }
        ;
        if (salary < requiredSalary) {
            System.out.println("To qualify for the loan you have to earn at least " + requiredSalary + " each year");
        }
        ;
        if (years < requiredYears) {
            System.out.println("To qualify for the loan you have to be working for at least " + requiredYears + " years in the same company");
        }
        ;


    }
}
