package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
        // createNewFile();
        // numbersExceptionHandling();
        try {
            createNewFileRethrow();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Some other error, not File, not Input");
        }
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        // file.createNewFile(); // unhandled exception: java.io.IOException
        try {
            file.createNewFile();
        }
        // catch (IOException e) { // this catches only IOExecption
        catch (Exception e) { // this catches any Exception
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }
}
