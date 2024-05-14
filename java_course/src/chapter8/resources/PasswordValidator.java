package chapter8.resources;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static chapter8.TextProcessor.scanner;
import static chapter8.TextProcessor.console;

public class PasswordValidator {

    public static void passwordValidator() {
        scanner.nextLine();

        String userName;
        String newPassword;
        String oldPassword;
        if (console == null)
        {
            System.out.print("Enter username: ");
            userName = scanner.nextLine();
            System.out.print("Enter OLD password: ");
            oldPassword = scanner.nextLine();
            System.out.print("Enter NEW password: ");
            newPassword = scanner.nextLine();
        }
        else
        {
            userName = console.readLine("Enter username: ");
            oldPassword = new String(console.readPassword("Enter OLD password: "));
            newPassword = new String(console.readPassword("Enter NEW password: "));
        }

        int moreThanEightChars = 0;
        int hasUpper = 0;
        int hasLower = 0;
        int noUserName = 1;
        int notOldPassWord = 1;
        if (newPassword.length() > 8) {
            moreThanEightChars = 1;
        }
        for (int i = 0; i < newPassword.length(); i++) {
            if (isUpperCase(newPassword.charAt(i))) {
                hasUpper = 1;
            }
            if (isLowerCase(newPassword.charAt(i))) {
                hasLower = 1;
            }
        }
        if (oldPassword != null && newPassword.contains(oldPassword)) {
            notOldPassWord = 0;
        }
        if (!newPassword.isEmpty() && !userName.isEmpty() && newPassword.contains(userName)) {
            noUserName = 0;
        }

        int complexity = moreThanEightChars + hasLower + hasUpper + noUserName + notOldPassWord;

        System.out.printf("""
                         User Name: %s
                         Old Password: %s
                         New Password: %s
                      """, userName, oldPassword, newPassword);

        System.out.printf("\n   Your password complexity is %d/5:\n\n", complexity);
        System.out.printf("""
                           [%s] has more than 8 chars
                           [%s] has Uppercase letter
                           [%s] has Lowercase letter
                           [%s] has no User Name
                           [%s] does not contain the Old Password
                        """,
                checkBoxPrinter(moreThanEightChars),
                checkBoxPrinter(hasUpper),
                checkBoxPrinter(hasLower),
                checkBoxPrinter(noUserName),
                checkBoxPrinter(notOldPassWord)
        );

    }

    public static String checkBoxPrinter(int numberBoolean){

        // not good practice switch with 1 case, but this printer maybe
        // would receive more cases!
        /*
        return switch (numberBoolean){
            case 1 -> "x";
            default -> " ";
        };
        */
        if (numberBoolean == 1) {return "x";}
        else {return " ";}
    }
}

/*
*    public static char[] hidePass() {
*        return console.readPassword("");
*    }
*/