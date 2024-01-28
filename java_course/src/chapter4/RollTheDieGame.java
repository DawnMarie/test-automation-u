package chapter4;

import java.util.Random;

/*
Chapter 4 Loops Exercise
Roll the Die Game - The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
* Roll the die for the user and advance the user that number of spaces on the game board.
* After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
* Repeat this 4 additional times for 5 rolls in total.
* If the user gets to 20 before 5 rolls, they have won.
* If they are greater than or less than 20 spaces exactly, they lose.
* There are only 20 spaces on the board, so they cannot advance farther than that.
 */
public class RollTheDieGame {

    public static void main(String[] args) {

        int maxRolls = 5;
        int maxSpaces = 20;

        int rolls = 0;
        int currentSpace = 0;

        while (rolls < maxRolls && currentSpace < maxSpaces) {

            Random random = new Random();
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.println("Roll #" + (rolls + 1) + ": You've rolled a " + die + ".");

            rolls++;

            if (currentSpace == 20) System.out.println("You're on space 20. Congrats, you win!");
            else if (currentSpace > 20) System.out.println("You ran out of space on the board. You lost!");
            else if (rolls == maxRolls) System.out.println("You are now on space " + currentSpace +
                    " but you ran out of die rolls before making it to space 20. You lost!");
            else
                System.out.println("You are now on space " + currentSpace + " and have " + (20 - currentSpace) + " more to go.");

        }

    }
}
