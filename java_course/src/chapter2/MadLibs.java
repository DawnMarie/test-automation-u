package chapter2;

import java.util.Scanner;

//A class that accepts three inputs and then outputs them within a template sentence
public class MadLibs {

    public static void main(String[] arg) {

        //Get the name of a season of the year
        System.out.println("Pick your favorite season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Get a whole number
        System.out.println("Pick your favorite number. No decimals allowed! ");
        int cups = scanner.nextInt();

        //Get an adjective
        System.out.println("Pick your favorite adjective (descriptive work): ");
        String adjective = scanner.next();
        scanner.close();

        //Complete the mad lib sentence
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + cups + " cups of coffee.");
    }
}
