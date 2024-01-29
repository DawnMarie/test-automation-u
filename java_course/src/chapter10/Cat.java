package chapter10;

/*
Chapter 10 Polymorphism
This is a child class to demonstrate polymorphism.
 */
public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void scratch() {
        System.out.println("I am a cat. I scratch things.");
    }
}
