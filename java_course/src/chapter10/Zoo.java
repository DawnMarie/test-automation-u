package chapter10;

/*
Chapter 10 Polymorphism
This is a main() class to demonstrate how polymorphic objects behave.
 */
public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);

    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) System.out.println("here's your dog food");
        if (animal instanceof Cat) System.out.println("here's your cat food");
    }
}
