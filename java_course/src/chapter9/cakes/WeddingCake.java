package chapter9.cakes;

public class WeddingCake extends Cake{
    public static String[] tiers;

    public static String[] getTiers() {
        return tiers;
    }

    public static void setTiers(String[] tiers) {
        WeddingCake.tiers = tiers;
    }
}
