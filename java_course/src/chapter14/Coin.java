package chapter14;

import java.util.Random;

/*
Chapter 14 Final Exercise
Coin Toss Game
* Write a class that has a field called side.
* The class should use encapsulation.
* It has constant variables for heads and tails.
* Include a method called flip with randomly chooses heads or tails
and assigns the value to side.
 */
public class Coin {

    final String HEADS = "heads";
    final String TAILS = "tails";
    private String side;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip() {
        Random coinFlip = new Random();
        int result = coinFlip.nextInt(2);

        if (result == 1) setSide(HEADS);
        else setSide(TAILS);

        System.out.println("The coin landed on " + getSide());
    }
}
