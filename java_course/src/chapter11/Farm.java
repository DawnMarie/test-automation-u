package chapter11;

/*
Chapter 11 Interfaces Exercise
Farm
* Create a Farm class to test the implementations.
 */
public class Farm {

    public static void main(String[] args) {

        Animal pig = new Pig();
        Animal duck = new Duck();

        pig.makeSound();
        pig.eat();

        duck.makeSound();
        duck.eat();
    }

}
