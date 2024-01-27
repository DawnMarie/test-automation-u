package chapter6;

import java.util.Scanner;

/*
Chapter 6 Objects Exercise
Calculate and produce an itemized cell phone bill.
* Allow the operator to input no data, just the id, or all necessary data.
* Print out the itemized bi
*/
public class ItemizedPhoneBill {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the id of the plan, 0 if the plan id is not available:");
        int id = scanner.nextInt();

        if (id == 0) {
            PhoneBill bill = new PhoneBill();
        } else {
            System.out.println("Please enter the base cost of the plan, 0.00 if unknown");
            double baseCost = scanner.nextDouble();
            if (baseCost == 0) {
                PhoneBill bill = new PhoneBill(id);
            } else {
                System.out.println("Please enter the base minutes of the plan:");
                int baseMinutes = scanner.nextInt();
                System.out.println("Please enter the number of minutes used:");
                int minutesUsed = scanner.nextInt();
                PhoneBill bill = new PhoneBill(id, baseCost, baseMinutes, minutesUsed);
            }
        }

        scanner.close();

    }

}
