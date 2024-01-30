package chapter11;

/*
Chapter 11 Interfaces Exercise
Farm
* Create an abstract class called Animal, which declares an abstract method
called makeSound(), and implements a non-abstract method called eat().
 */
public abstract class Animal {

    abstract void makeSound();

    public void eat() {
        System.out.println("nom nom nom");
    }

}
