package chapterfour;
import java.util.Scanner;

public class AverageStudentScore {
    // I`m just a regular everyday normal --- student
    public static void main(String[] args) { //could be a Java tattoo
        int totalTests = 4;

        String[] studentsList = new String[] {"John", "Alice", "Lucas", "Marie", "Albert", "Mickey"};
        double[] averageTest = new double[studentsList.length];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < studentsList.length; i++) {
            String student = studentsList[i];
            double total = 0;
            System.out.println("Actual Student: "+ student);
            for (int test = 0; test < totalTests; test++) {
                System.out.println("Enter the score for" + student + "'s Test #" + (test + 1) + " :");
                total += scanner.nextDouble();
            }
            double average = total / totalTests;
            averageTest[i] = average;
            System.out.println("The test average for student " + student + " is " + average);

        }
        scanner.close();



    }


}
