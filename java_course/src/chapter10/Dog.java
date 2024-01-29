package chapter10;

/*
Chapter 10 Polymorphism
This is a child class to demonstrate polymorphism.
 */
public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    public void fetch() {
        System.out.println("fetch is fun!");
    }
}
