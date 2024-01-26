package chapter4;

import java.util.Scanner;

/*
Nested Loop Example
Search a String to determine if it contains the letter 'A'.
 */
public class LetterSearch {

    public static void main(String[] args) {

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        for (int i=0; !letterFound && i<text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
            }
        }

        if (letterFound) System.out.println("This text contains the letter 'a'");
        else System.out.println("This text does not contain the letter 'a'");
    }
}
