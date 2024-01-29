package chapter10;

/*
Chapter 10 Polymorphism Exercise
Fruit Market
* Create two subclasses of the Fruit class and create methods that are specific to each one.
* Set the calories within the constructors of the subclasses.
* Override the makeJuice method to print the specific type of juice that's made.
 */
public class Kiwi extends Fruit {

    public Kiwi(int calories) {
        this.calories = calories;
    }

    public void peel() {
        System.out.println("The kiwi is now peeled.");
    }

    @Override
    public void makeJuice() {
        System.out.println("There is now kiwi juice to enjoy.");
    }
}
