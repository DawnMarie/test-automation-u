package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Chapter 13b Throwing Exceptions Example
This class demonstrates how to use try-catch blocks ior re-throwing
in order to handle exceptions correctly.
 */
public class ExceptionHandling {

    public static void main(String[] args) {

        createNewFile();
        numbersExceptionHandling();
        try {
            createNewFileRethrow();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling() {

        File file = new File("resources/numbers.txt");

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }

    }
}
