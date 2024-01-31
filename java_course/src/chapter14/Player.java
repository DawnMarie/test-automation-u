package chapter14;

/*
Chapter 14 Final Exercise
Coin Toss Game
* Write a class called Player with fields name and guess.
* The class should use encapsulation.
* There should be a constructor which accepts name.
 */
public class Player {

    private String name;
    private String guess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public Player(String name) {
        setName(name);
    }
}
