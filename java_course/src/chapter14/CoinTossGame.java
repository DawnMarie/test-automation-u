package chapter14;

import java.util.Objects;
import java.util.Scanner;

/*
Chapter 14 Final Exercise
Coin Toss Game
* Write a class called CoinTossGame that creates two Players and a Coin.
* Player 1 should be asked to choose Heads or Tails and the response should be validated.
* Player 2's guess should automatically be the opposite of Player 1.
* The Coin should be flipped.
* The winner should be determined.
 */
public class CoinTossGame {

    public static void main(String[] args) {

        Player player1 = new Player("Susie");
        Player player2 = new Player("Kris");
        Coin coin = new Coin();
        Scanner scanner = new Scanner(System.in);

        boolean isValid;

        System.out.println(player1.getName() + ", what is your guess on the coin flip?");
        System.out.println("Enter 'heads' or 'tails'.");

        do {
            var guess = scanner.next();
            isValid = (guess.equals(coin.HEADS) || guess.equals(coin.TAILS));
            player1.setGuess(guess);
            if (!isValid) {
                System.out.println("That wasn't 'heads' or 'tails'. Please enter a valid response.");
            }
        } while (!isValid);

        if (Objects.equals(player1.getGuess(), coin.HEADS)) player2.setGuess(coin.TAILS);
        else player2.setGuess(coin.HEADS);

        coin.flip();

        if (Objects.equals(coin.getSide(), player1.getGuess())) System.out.println(player1.getName() + ", you've won!");
        else System.out.println(player2.getName() + ", you've won!");
    }

}
