package chapterfour;
// import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double sumIs = num1 + num2;

            System.out.println("The sum is " + sumIs);

            System.out.println("Would you like to start over?");
            String answer = scanner.next();
            //String[] positiveAnswers = {"","","","",""};
            Set<String> positiveAnswers = Set.of("yes", "ok", "right", "1", "true", "fine", "yup");
            if (positiveAnswers.contains(answer))
            //if ( Arrays.stream(positiveAnswers).anyMatch(answer::equals) )
            {
                again = true;
            } else {
                again = false;
            }
        } while (again);
        System.out.println("Ok, see you next time!");
        scanner.close();
    }
}
