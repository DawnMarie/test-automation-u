package chapter9;

/*
Chapter 9 Inheritance Exercise
Cake! Cake! Cake!
* Create a BirthdayCake class which inherits from Cake and has a field called candles.
* Its constructor should set the flavor.
* Include getter and setter methods.
 */
public class BirthdayCake extends Cake {

    int candles;

    public BirthdayCake(String flavor) {
        setFlavor(flavor);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public void printCandles() {
        System.out.println(this.getClass().getSimpleName() + " has " + getCandles() + " candles included in this price.");
    }
}
