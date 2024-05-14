package chapter14;

public class Coin {

    private int side; // 0- heads, 1- tails

    public int flipCoin() {
        this.side = (int) Math.round(Math.random());
        // System.out.printf("Coin flipped: %s\n", this.side);
        return this.side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
