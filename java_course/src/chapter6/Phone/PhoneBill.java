package chapter6.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneBill {
    // static parameters
    public static double overageMinuteCost = 0.20; // $0.20 per overage minute
    public static double taxPercentage = 15; // 15% of tax
    public static double tax = taxPercentage / 100;

    // parameters
    double id;
    double baseCost;
    double allottedMinutes;
    double minutesUsed;

    //constructors
    public PhoneBill(){}
    public PhoneBill(double id){
        this.id = id;
    }
    public PhoneBill(double id, double baseCost, double allottedMinutes, double minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    // Non-Static Methods
    // 1- all of them need information instantiated in an Object
    //    so, none of them are 'static'
    // 2- all of them will be accessed from other Classes in this same Package
    //    so we can turn it 'public' or leave without an 'access marker'
    public double calculateOverageTax(){
        double overageTax;
        if(this.minutesUsed < this.allottedMinutes){
            overageTax = 0;
        }
        else{overageTax = overageMinuteCost*(this.minutesUsed - this.allottedMinutes);}
        return overageTax;
    }
    public double calculateTax(){
        return (this.baseCost + this.calculateOverageTax()) * tax;
    }

    public double calculateTotal(){
        return (this.baseCost + this.calculateOverageTax()+this.calculateTax());
    }
    public List<List<String>> makeTable() {
        double planFee= this.baseCost;
        double overageFees= calculateOverageTax();
        double subtotal= planFee + overageFees;
        double tax= this.calculateTax();
        double billTotal = this.calculateTotal();
        double overageMinutes= (this.minutesUsed > this.allottedMinutes)? (this.minutesUsed - this.allottedMinutes): 0;

        List<List<String>> rows = new ArrayList<>();
        List<String> headers = Arrays.asList("ORIGIN", "USED", "PRICE PER UNIT", "SUBTOTAL IN $");
        rows.add(headers);
        rows.add(Arrays.asList("----------------------------","-------","--------------","--------------"));
        rows.add(Arrays.asList("plan fee", "-", "-", String.format("%.2f", planFee)));
        rows.add(Arrays.asList("overage minutes fees", String.format("%.2f", overageMinutes), String.format("%.2f", overageMinuteCost), String.format("%.2f", overageFees)));
        rows.add(Arrays.asList("plan + overage", "-", "-", String.format("%.2f", subtotal)));
        rows.add(Arrays.asList("taxes over (plan + overage)", String.format("%.2f", subtotal), taxPercentage + "%", String.format("%.2f", tax)));
        rows.add(Arrays.asList("----------------------------","-------","--------------","--------------"));
        rows.add(Arrays.asList("TOTAL", "-", "-", String.format("%.2f", billTotal)));
        return rows;
    }

    public void printItemizedBill() {
        List<List<String>> rows = makeTable();
        System.out.println("\n");
        System.out.println("USER ID: "+this.id);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(formatAsTable(rows));
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\n");
    }

    // Static Method(s)
    // It doesn't need any specific data instantiated in an Object of this Class.
    public static String formatAsTable(List<List<String>> rows)
    {
        int[] maxLengths = new int[rows.getFirst().size()];
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
