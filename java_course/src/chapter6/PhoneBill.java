package chapter6;

/*
Chapter 6 Objects Exercise
Calculate the necessary numbers for someone's cell phone bill.
* Charge the user .25 for every minute they were over plan, and 15% tax on that subtotal.
* Create separate methods to calculate the tax, overage fees, and final total.
* Constructors should include default, id-only, all fields. No matter which constructor is used, all fields should be set.
 */
public class PhoneBill {

    private int id = 1001;
    private double baseCost = 19.95;
    private int baseMinutes = 60;
    private int minutesUsed = 60;

    //This default constructor assumes the most basic of users
    public PhoneBill() {
        printItemizedBill();
    }

    //The id-only constructor also assumes a very basic user
    public PhoneBill(int id) {
        this.id = id;
        printItemizedBill();
    }

    //This is an all-fields constructor
    public PhoneBill(int id, double baseCost, int baseMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost=baseCost;
        this.baseMinutes = baseMinutes;
        this.minutesUsed = minutesUsed;
        printItemizedBill();
    }

    private static double calculateOverageFee(int baseMinutes, int minutesUsed) {
        double rate = .25;
        int minutes = minutesUsed - baseMinutes;
        if (minutes <= 0) return 0;
        else return minutes * rate;
    }

    private static double calculateTax(double planCost, double overage) {
        double taxRate = .15;
        return (planCost + overage)*taxRate;
    }

    private static double calculateTotal(double planCost, double overage, double taxes) {
        return planCost + overage + taxes;
    }

    private void printItemizedBill() {
        double overageFee = calculateOverageFee(baseMinutes, minutesUsed);
        double tax = calculateTax(baseCost, overageFee);
        double total = calculateTotal(baseCost, overageFee, tax);

        System.out.println("Phone Bill Statement");
        System.out.println("Id: " + id);
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
