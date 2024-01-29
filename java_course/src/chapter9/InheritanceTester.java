package chapter9;

/*
Chapter 9d Access Limitations & Multiple Inheritances Example
This class demonstrates that inheritance can pass through multiple
layers of objects in a chain.
 */
public class InheritanceTester {

    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Person");

        System.out.println(mom.getName() + " is a " + mom.getGender());

    }
}
