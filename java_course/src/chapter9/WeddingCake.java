package chapter9;

/*
Chapter 9 Inheritance Exercise
Cake! Cake! Cake!
* Create a WeddingCake class which inherits from Cake and has a field called tiers.
* Its constructor should set the flavor.
* Include getter and setter methods.
 */
public class WeddingCake extends Cake {

    int tiers;

    public WeddingCake(String flavor) {
        setFlavor(flavor);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public void printTiers() {
        System.out.println(this.getClass().getSimpleName() + " has " + getTiers() + " tiers included in this price.");
    }
}
