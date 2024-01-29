package chapter9;

/*
Method Overloading & Overriding Example
This is a base class of a Rectangle class that can be used by itself,
or as a parent for other similar classes.
 */
public class Rectangle {

    double length;
    double width;
    double sides = 4;

    public Rectangle() {
        length = 0;
        width = 0;
    }

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

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public void print() {
        System.out.println("I am a rectangle.");
    }

}