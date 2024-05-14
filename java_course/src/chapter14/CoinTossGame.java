package chapter14;

public class CoinTossGame {
    public static void main(String[] args) {
        int pointsToWin = 10;
        int roundsLimit = 15;
        game(pointsToWin, roundsLimit);
    }

    public static void game(int pointsToWin, int roundsLimit) {
        Player player1 = new Player("p1");
        Player player2 = new Player("p2");
        Coin coin = new Coin();
        printHeader();

        for (int round = 0; round < roundsLimit; round++) {
            if (!(player1.getPoints() >= pointsToWin ||
                    player2.getPoints() >= pointsToWin ||
                    round >= roundsLimit
            )) {
                round(coin, player1, player2);
                printRound(round, coin, player1, player2);
            }
        }
    }

    public static void round(Coin coin, Player player1, Player player2) {
        coin.flipCoin();
        player2.setGuess(player1.guessCoin() == 1 ? 0 : 1);
        if (coin.getSide() == player1.getGuess()) {
            player1.makePoint();
        } else if (coin.getSide() == player2.getGuess()) {
            player2.makePoint();
        }
    }

    public static void printHeader() {
        String formatHeader = "%-5s%10s%10s%10s%10s%10s\n";
        System.out.printf(formatHeader, "Round", "P1 Guess", "P2 Guess", "Coin", "P1 Score", "P2 Score");
    }

    public static void printRound(int round, Coin coin, Player player1, Player player2) {
        String format = "%5s%10s%10s%10s%10s%10s\n";
        System.out.printf(format, (round + 1), player1.getGuess(), player2.getGuess(), coin.getSide(), player1.getPoints(), player2.getPoints());

    }

}
