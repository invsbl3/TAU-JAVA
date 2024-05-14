package chapter9;

import chapter9.cakes.BirthdayCake;
import chapter9.cakes.WeddingCake;
import chapter9.someclasses.Employee;
import chapter9.someclasses.Mother;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InheritanceTester {

    public static final Scanner scanner = new Scanner(System.in);

    // actually I'm proud of this .-. a good work
    public static void main(String[] args) {
        Employee employee = new Employee();
        Mother mother = new Mother();
        // to create an employee we have to start first a `person`...
        // to create a mother -> woman -> person -> object
        printChainInheritanceFields(employee);
        printChainInheritanceFields(mother);

        BirthdayCake birthdayCake = new BirthdayCake();
        WeddingCake weddingCake = new WeddingCake();

        printChainInheritanceFields(birthdayCake);
        printChainInheritanceFields(weddingCake);
    }

    public static void printChainInheritanceFields(Object object) {

        Class<?> C = object.getClass();
        System.out.print("\nHeritages from Class: " + C.getSimpleName() + "\n");

        int extensionLevel = 0;
        String heritage = "Heritage Level";
        String className = "Class Name";
        String fieldString = "Fields";
        String methodString = "Methods";
        String spaces = "   ";

        String format = "%s%-20s%-20s%-30s%-40s%n";
        System.out.print(spaces + "------------------------------------------------------------------------------------------------------\n");
        System.out.printf(format, spaces, heritage, className, fieldString, methodString);
        System.out.print(spaces + "------------------------------------------------------------------------------------------------------\n");

        while (C != null) {
            Field[] fields = C.getDeclaredFields();
            StringBuilder fieldS = new StringBuilder();
            for (Field field : fields) {
                fieldS.append(field.getName()).append(", ");
            }
            if (!fieldS.isEmpty()) {
                fieldS.delete(fieldS.length() - 2, fieldS.length() - 1);
            }

            Method[] methods = C.getDeclaredMethods();
            StringBuilder methodsNames = new StringBuilder();
            for (Method method : methods) {
                methodsNames.append(method.getName()).append(", ");
            }
            if (!methodsNames.isEmpty()) {
                methodsNames.delete(methodsNames.length() - 2, methodsNames.length() - 1);
            }

            System.out.printf(format, spaces, extensionLevel, C.getSimpleName(), fieldS, methodsNames);
            extensionLevel++;
            C = C.getSuperclass();
        }
        System.out.print(spaces + "------------------------------------------------------------------------------------------------------\n");
        pressEnterToContinue();
    }

    public static void pressEnterToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            scanner.nextLine();
        } catch (Exception _) {
        }
    }
}
