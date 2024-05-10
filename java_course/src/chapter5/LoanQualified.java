package chapter5;

import java.util.Scanner;

public class LoanQualified {
    public static double minimumSalaryToApprove = 3000;
    public static double minimumCreditScoreToApprove = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        double creditScore = getCreditScore();
        boolean isApproved = isApproved(salary, creditScore);
        scanner.close();
        notifyUser(isApproved);
    }

    public static double getSalary() {
        System.out.println("What's your salary?");
        return scanner.nextDouble();
    }

    public static double getCreditScore() {
        System.out.println("What's your credit score?");
        return scanner.nextDouble();
    }

    public static boolean isApproved(double salary, double creditScore) {
        boolean isApproved;
        isApproved = salary >= minimumSalaryToApprove && creditScore >= minimumCreditScoreToApprove;
        return isApproved;
    }

    public static void notifyUser(boolean isApproved) {
        if(isApproved){
            System.out.println("You can take the money!");
        } else {
            System.out.println("Salary or Score not enough.");
        }
    }
}
