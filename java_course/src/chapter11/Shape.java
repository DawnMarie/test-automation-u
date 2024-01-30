package chapter11;

/*
Chapter 11a Abstraction Example
This class demonstrates how to write an abstract class.
 */
public abstract class Shape {

    abstract double calculateArea();

    public void print() {
        System.out.println("I am a shape.");
    }
}
