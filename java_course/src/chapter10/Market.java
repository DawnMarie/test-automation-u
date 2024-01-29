package chapter10;

/*
Chapter 10 Polymorphism Exercise
Fruit Market
* This class tests polymorphism by creating several variations of the Fruit child classes.
 */
public class Market {

    public static void main(String[] args) {
        Kiwi realKiwi = new Kiwi(100);
        Fruit maybeKiwi = new Kiwi(150);
        Lemon realLemon = new Lemon(50);
        Fruit maybeLemon = new Lemon(75);

        System.out.print("Real Kiwi: ");
        realKiwi.peel();
        System.out.print("Real Kiwi: ");
        realKiwi.makeJuice();
        System.out.println();

        System.out.print("Maybe Kiwi: ");
        maybeKiwi.makeJuice();
        System.out.println();

        System.out.print("Real Lemon: ");
        realLemon.zest();
        System.out.print("Real Lemon ");
        realLemon.makeJuice();
        System.out.println();

        System.out.print("Maybe Lemon: ");
        maybeLemon.makeJuice();
        System.out.println();

        System.out.print("Maybe Kiwi: ");
        if (maybeKiwi instanceof Kiwi) System.out.println("Nope still a kiwi.");
        maybeKiwi = new Lemon(25);
        System.out.print("Maybe Kiwi: ");
        System.out.println(maybeKiwi.calories);
        System.out.print("Maybe Kiwi: ");
        maybeKiwi.makeJuice();
        System.out.print("Maybe Kiwi: ");
        if (maybeKiwi instanceof Lemon) System.out.println("Really a lemon, promise!");
        System.out.print("Maybe Kiwi: ");
        if (maybeKiwi instanceof Kiwi) System.out.println("Nope still a kiwi.");
        else System.out.println("Not a kiwi anymore, sorry");
        System.out.print("Maybe Kiwi: ");
        if (maybeKiwi instanceof Fruit) System.out.println("Actually too ambiguous to tell.");
        System.out.println();

    }
}
