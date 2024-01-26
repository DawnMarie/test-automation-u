package chapter3;

import java.util.Scanner;

/*
Chapter 3 Decision Structures Exercise
Change for a Dollar Game - The objective of the game is to enter enough change to equal exactly $1!  Create a program
that asks a user to enter the quantities for the following coins: pennies, nickels, dimes, and quarters.  Your program
should count up the value of all the change.  If it's exactly $1, they win!  If it's more than $1, tell them by how
much they went over.  If it's less than $1, tell them by how much they went under.
*/
public class ChangeForADollarGame {

    public static void main(String[] args) {

        //Initialize coin values
        double pennyValue = .01d;
        double nickelValue = .05d;
        double dimeValue = .10d;
        double quarterValue = .25d;
        int dollar = 1;

        //Collect answers from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies do you have?");
        double pennies = scanner.nextDouble();

        System.out.println("How many nickels do you have?");
        double nickels = scanner.nextDouble();

        System.out.println("How many dimes do you have?");
        double dimes = scanner.nextDouble();

        System.out.println("How many quarters do you have?");
        double quarters = scanner.nextDouble();

        scanner.close();

        //Calculate and compare
        double totalValue = (pennies * pennyValue) + (nickels * nickelValue) + (dimes * dimeValue) + (quarters * quarterValue);
        double overUnder = totalValue - dollar;

        //This is actually outputting a large amount of rounding errors which can only be fixed by using number
        //types with a higher precision than double. Hurray, I've duplicated a known issue in Java
        //without trying too hard??
        if (overUnder == 0) System.out.println("Congrats, you win!");
        else if (overUnder > 0) System.out.println("Sorry, you are " + overUnder + " dollars over.");
        else if (overUnder < 0) System.out.println("Sorry, you are " + (overUnder * -1) + " dollars under.");
        else System.out.println("A very unexpected error occurred.");

    }
}
