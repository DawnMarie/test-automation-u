package chapter9;

/*
Chapter 9 Inheritance Exercise
Cake! Cake! Cake!
* Create a TasteTester class which prints the flavor and price of each of these cakes.
*/
public class TasteTester {

    public static void main(String[] args) {

        Cake plainCake = new Cake("vanilla");
        plainCake.setPrice(19.95);
        plainCake.advertise();

        BirthdayCake birthdayCake = new BirthdayCake("confetti");
        birthdayCake.setPrice(29.95);
        birthdayCake.setCandles(10);
        birthdayCake.advertise();
        birthdayCake.printCandles();

        WeddingCake weddingCake = new WeddingCake("chocolate raspberry");
        weddingCake.setPrice(49.95);
        weddingCake.setTiers(3);
        weddingCake.advertise();
        weddingCake.printTiers();

    }
}
