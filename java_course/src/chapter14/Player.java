package chapter14;

public class Player {
    private String name;
    private int guess;
    private int points = 0;

    public void makePoint(){
        this.points++;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int guessCoin() {
        this.guess = (int) Math.round(Math.random());
        // System.out.printf("%s guessed %d\n", this.name, this.guess);
        return this.guess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public Player(String name) {
        this.name = name;
    }


}
