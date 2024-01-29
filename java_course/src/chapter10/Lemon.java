package chapter10;

/*
Chapter 10 Polymorphism Exercise
Fruit Market
* Create two subclasses of the Fruit class and create methods that are specific to each one.
* Set the calories within the constructors of the subclasses.
* Override the makeJuice method to print the specific type of juice that's made.
 */
public class Lemon extends Fruit {

    public Lemon(int calories) {
        this.calories = calories;
    }

    public void zest() {
        System.out.println("There is now some grated lemon peel. Smells great!");
    }

    @Override
    public void makeJuice() {
        System.out.println("There is now lemon juice to enjoy.");
    }
}
