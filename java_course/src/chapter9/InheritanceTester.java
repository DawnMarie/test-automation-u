package chapter9;

/*
Chapter 9c Overloading & Overriding Methods Example
This class demonstrates that Square objects have all the same
methods available as the Rectangle object, but one of the methods
is overridden from the parent, and one of the methods has both a Square
and a Rectangle version.
 */
public class InheritanceTester {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square.");

        testSquareOverride();

    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}
