package chapter11;

/*
Chapter 11 Interfaces Exercise
Farm
* Create a Pig class and a Duck class that both extend the Animal class.
 */
public class Duck extends Animal {

    @Override
    void makeSound() {
        System.out.println("quack quack");
    }

}
