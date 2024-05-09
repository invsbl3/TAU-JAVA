package chapterfive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class PhoneBillCalculator {
    public static double chargeForMinute = 0.25;
    public static double taxPercentage = 15; // 15% of taxes
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double planFee = getPlanFee();
        double overageMinutes = getOverageMinutes();
        double overageFees = calculateOverageFees(overageMinutes);
        double subtotal = planFee + overageFees;
        double tax = calculateTax(subtotal);
        double billTotal = calculateBillTotal(planFee, tax, subtotal);
        scanner.close();
        printItemizedBill( planFee,  overageMinutes, overageFees,  subtotal,  tax,  billTotal);
    }

    public static double getPlanFee() {
        System.out.println("Input you plan fee:");
        return scanner.nextDouble();
    }

    public static double getOverageMinutes() {
        System.out.println("Input you plan overage minutes:");
        return scanner.nextDouble();
    }

    public static double calculateBillTotal(double planFee, double tax, double subtotal) {
        return planFee + tax + subtotal;
    }

    public static double calculateTax(double subtotal) {
        return subtotal * (taxPercentage / 100);
    }

    public static double calculateOverageFees(double overageFee) {
        return chargeForMinute * overageFee;
    }

    public static void printItemizedBill(double planFee, double overageMinutes, double overageFees, double subtotal, double tax, double billTotal) {
        List<List<String>> rows = new ArrayList<>();
        List<String> headers = Arrays.asList("ORIGIN", "USED", "PRICE PER UNIT", "SUBTOTAL IN $");
        rows.add(headers);
        rows.add(Arrays.asList("----------------------------","-------","--------------","--------------"));
        rows.add(Arrays.asList("plan fee", "-", "-", String.valueOf(planFee)));
        rows.add(Arrays.asList("overage minutes fees", String.valueOf(overageMinutes), String.valueOf(chargeForMinute), String.valueOf(overageFees)));
        rows.add(Arrays.asList("plan + overage", "-", "-", String.valueOf(subtotal)));
        rows.add(Arrays.asList("taxes over (plan + overage)", String.valueOf(subtotal), taxPercentage + "%", String.valueOf(tax)));
        rows.add(Arrays.asList("----------------------------","-------","--------------","--------------"));
        rows.add(Arrays.asList("TOTAL", "-", "-", String.valueOf(billTotal)));
        System.out.println("\n\n");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(formatAsTable(rows));
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\n\n");
    }

    public static String formatAsTable(List<List<String>> rows)
    {
        int[] maxLengths = new int[rows.get(0).size()];
        for (List<String> row : rows)
        {
            for (int i = 0; i < row.size(); i++)
            {
                maxLengths[i] = Math.max(maxLengths[i], row.get(i).length());
            }
        }

        StringBuilder formatBuilder = new StringBuilder();
        for (int maxLength : maxLengths)
        {
            formatBuilder.append("%-").append(maxLength + 2).append("s");
        }
        String format = formatBuilder.toString();

        StringBuilder result = new StringBuilder();
        for (List<String> row : rows)
        {
            result.append(String.format(format, row.toArray(new String[0]))).append("\n");
        }
        return result.toString();
    }
}
