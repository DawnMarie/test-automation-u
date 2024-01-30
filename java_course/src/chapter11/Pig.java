package chapter11;

/*
Chapter 11 Interfaces Exercise
Farm
* Create a Pig class and a Duck class that both extend the Animal class.
 */
public class Pig extends Animal {

    @Override
    public void makeSound() {
        System.out.println("oink oink");
    }

}
