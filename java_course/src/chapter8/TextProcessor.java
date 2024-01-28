package chapter8;

/*
Chapter 8b Strings Example
Write a method that counts the number of words in a String and prints
them individually on a new line.
Write another method that prints a given String backwards. For example,
if given camel, it prints lemac.
Write another method that adds spaces to a jumbled String where all words
are written together with no spaces. Each new word begins with a capital
letter.
 */
public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Test Automation U");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeDawnMarie");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     *
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        for (int i = text.length()-1; i>= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println("");
    }

    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text) {

        var modifiedText = new StringBuilder(text);

        for (int i=0; i<modifiedText.length(); i++) {
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}
