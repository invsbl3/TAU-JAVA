package chapter9.cakes;

public class BirthdayCake extends Cake{
    public static String[] getCandles() {
        return candles;
    }

    public static void setCandles(String[] candles) {
        BirthdayCake.candles = candles;
    }

    public static String[] candles;
}
