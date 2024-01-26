package chapter5;

import java.util.Scanner;

/*
Chapter 5 Methods Exercise
Calculate the final total of someone's cell phone bill.
* Allow the operator to input the plan fee and the number of overage minutes.
* Charge the user .25 for every minute they were over plan, and 15% tax on that subtotal.
* Create separate methods to calculate the tax, overage fees, and final total.
* Print the itemized bill.
 */
public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();

        scanner.close();

        double overageFee = calculateOverageFee(overageMinutes);
        double tax = calculateTax(baseCost, overageFee);
        double total = calculateTotal(baseCost, overageFee, tax);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);

    }

    public static double calculateOverageFee(int minutes) {
        double rate = .25;
        return minutes * rate;
    }

    public static double calculateTax(double planCost, double overage) {
        double taxRate = .15;
        return (planCost + overage)*taxRate;
    }

    public static double calculateTotal(double planCost, double overage, double taxes) {
        return planCost + overage + taxes;
    }
}
