package chapter11;

/*
Chapter 11a Abstraction Example
This class demonstrates how to extend and implement abstract classes and methods.
 */
public class Rectangle extends Shape {

    private double length;
    private double width;


    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
