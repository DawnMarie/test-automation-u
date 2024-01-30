package chapter11;

/*
Chapter 11a Abstraction Example
This class demonstrates how to use classes that inherit from an abstract class.
 */
public class ShapeTester {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
