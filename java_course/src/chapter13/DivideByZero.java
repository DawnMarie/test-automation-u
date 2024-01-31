package chapter13;

/*
Chapter 13 Exceptions Exercise
Divide by Zero
* Write a main() method that attempts the calculation int c = 30/0
* Handle the exception.
* Print a statement after the calculation to say "Division is fun." This
statement should be outputted no matter what.
 */
public class DivideByZero {

    public static void main(String[] args) {

        try {
            int c = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Division is fun.");
        }

    }
}
