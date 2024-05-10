package chapter6.Lessons;

public class MonthConverter {

    public static void main(String[] args){
        // 1- access static methods of a Class -> don't need to
        //    instantiate it (create an object)

        // 2- access two Methods with same name but
        // different input types is okay.
        System.out.println(Month.getMonth(2));
        System.out.println(Month.getMonth("January"));
    }
}
