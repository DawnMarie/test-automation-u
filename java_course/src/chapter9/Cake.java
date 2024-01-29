package chapter9;

/*
Chapter 9 Inheritance Exercise
Cake! Cake! Cake!
* Create a superclass called Cake that has two fields: flavor and price.
* Create a constructor that accepts the flavor.
* Getter and setter methods should also be created.
 */
public class Cake {

    String flavor;
    double price;

    public Cake() {
    }

    public Cake(String flavor) {
        setFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void advertise() {
        System.out.println("This " + this.getClass().getSimpleName() + " comes in " + getFlavor() + " flavor and costs " + getPrice() + ".");
    }

}
