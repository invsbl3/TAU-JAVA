package chapterthree;

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test score:");
        double score = scanner.nextDouble();
        // else if == "if the anterior condition is false
        //              but this one is true, then  go ahead"
        // only the first condition reached is executed in the line!


        String grade = "";
        if (Double.MIN_VALUE < score && score < 0) {
            grade = "gotta woke up on the right side of the bed";
        } else if (0 <= score && score <= 60) {
            grade = "F";
        } else if (score < 70) {
            grade = "D";
        } else if (score < 80) {
            grade = "C";
        } else if (score < 90) {
            grade = "B";
        } else if (score <= 100) {
            grade = "A";
        } else if (8000 >= score && score > 100) {
            grade = "Damn!";
            System.out.println("invalid score");
        } else if (Double.MAX_VALUE > score && score > 8000) {
            grade = "MORE THAN 8000 ?!?!?!?";
            System.out.print("More than 8000?!?!");
        } else if (score >= Double.MAX_VALUE || Double.MIN_VALUE > score) {
            grade = "big enough for a smart person";
            System.out.println("Home Run!!! Outta range to calculate, cheater, go away and stop crashing java");
        }
        System.out.println("Your grade in the test is " + grade);


        String message;

        switch (grade) {
            case "A":
                message = "Nice job";
                //System.out.println("here we are without a break statement, grade = A gives us..."
                // +" , the message is now: " + message);
                break;
            case "B":
            case "C":
                message = "Well done";
                break;
            case "D":
            case "E":
                message = "Better check your homework";
                break;
            case "F":
                message = "Good-bye video-games, good-bye phones, oh no .-.";
                break;
            default:
                message = "Something strange is ocurring, be careful and wise with this code";
                break;
        }
        ;
        System.out.println(message);
    }

    ;
};
