package chapter6;

/*
Chapter 6d Method Overloading Example
Multiple methods in a class can have the same name,
as long as their parameters (and thus signature) are different.
 */
public class MonthConverter {

    public static void main(String[] args) {
        System.out.println(Month.getMonth(2));
        System.out.println(Month.getMonth("January"));
    }

}
