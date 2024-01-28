package chapter7;

import java.util.Scanner;

/*
Chapter 7 Arrays Exercise
* Make an array that holds the textual values of the days of the week.
* Have the user input a number corresponding to the day of the week.  Assume the week starts on Monday.
* Your program should output the String that represents the day of the week.
* Example: User inputs the number 1, your program should print "Monday".
 */
public class DaysOfTheWeek {

    private static final String[] DAYS = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
    };
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What day number of the week is it?");
        int day = scanner.nextInt() - 1;

        System.out.println(DAYS[day]);
    }

}
