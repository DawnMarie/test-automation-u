package chapter2;

import java.util.Scanner;

//A class that will calculate an employee's weekly wages, given the rate of pay and number of hours worked
public class GrossPayCalculator {

    public static void main(String[] arg) {

        //Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        //Multiply hours by payrate to get total dollars to pay
        double grossPay = hours * rate;

        //Display result
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
