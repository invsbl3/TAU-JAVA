package chapter13;

public class DivisionByZero {
    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Non Arithmetic Exceptions");
        } finally {
            System.out.println("Division is fun");
        }
    }

    public static void divide() throws ArithmeticException {
        int c = 30 / 0;
    }
}
